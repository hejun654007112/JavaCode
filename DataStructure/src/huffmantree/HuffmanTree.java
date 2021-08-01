package huffmantree;

import java.io.*;
import java.util.*;

public class HuffmanTree {
    static Map<Byte, String> huffmanCodes = new HashMap<>();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        zipFile("F:\\360Downloads\\Software\\QQ音乐_18.13.0.0.exe","F:\\360Downloads\\Software\\QQ音乐_18.13.0.0.zip");
//        decodeFile("F:\\2.zip","F:\\2.bmp");

    }

    public static void zipFile(String filePath,String desPath) throws IOException {
        FileInputStream is = null;
        FileOutputStream os = null;
        ObjectOutputStream oos=null;

        is = new FileInputStream(filePath);

        byte[] b = new byte[is.available()] ;
        is.read(b);
        byte[] zipBytes = huffmanZip(b, huffmanCodes);
        os = new FileOutputStream(desPath);
        oos = new ObjectOutputStream(os);
        oos.writeObject(zipBytes);
        oos.writeObject(huffmanCodes);

        is.close();
        os.close();
        oos.close();

        System.out.println("压缩成功~");
    }
    public static void decodeFile(String filePath,String desPath) throws IOException, ClassNotFoundException {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(filePath));
        FileOutputStream os = new FileOutputStream(desPath);

        byte[] bytes = (byte[]) is.readObject();

        Map<Byte, String> huffmanCode = (Map<Byte, String>) is.readObject();

        byte[] decode = decode(bytes, huffmanCode);

        os.write(decode);

        is.close();
        os.close();

        System.out.println("解压成功~~");
    }


    public static void Test() {
        String content = "i like like like java do you like a java";

        byte[] bytes = content.getBytes();

        byte[] zip = huffmanZip(bytes, huffmanCodes);

        byte[] decode = decode(zip, huffmanCodes);

        System.out.println(new String(decode));
    }

    //解码
    public static byte[] decode(byte[] zipContens,Map<Byte, String> cods){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < zipContens.length; i++) {
            boolean flag = i==zipContens.length-1;
            stringBuilder.append(byteToBitString(!flag,zipContens[i]));
        }
//        System.out.println(stringBuilder.length());

        HashMap<String, Byte> map = new HashMap<>();
        for (Map.Entry<Byte,String> entry:cods.entrySet()){
            map.put(entry.getValue(),entry.getKey());
        }

        ArrayList<Byte> list = new ArrayList<>();
        for (int i = 0; i < stringBuilder.length();) {
            int count = 1;
            Byte b = null;
            boolean flag = true;
            while (flag){
                String s = stringBuilder.substring(i,i+count);
                b = map.get(s);
                if (b !=null){
                   flag = false;
                   break;
                }
                count++;
            }
            list.add(b);
            i+=count;
        }
//        System.out.println(list.size());
        byte[] bytes = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bytes[i] = list.get(i);
        }
        return bytes;
    }

    public static String byteToBitString(boolean flag,byte b){
        int temp = b;
        if (flag){
            temp = temp | 256;
        }
        String s = Integer.toBinaryString(temp);
        if (flag){
            return s.substring(s.length() - 8);
        }else {
            return s;
        }
    }

    public static List<Node> getNodesList(byte[] bytes) {
        HashMap<Byte, Integer> hashMap = new HashMap<>();
        for (byte aByte : bytes) {
            if (!hashMap.containsKey(aByte)){
                hashMap.put(aByte,1);
            }else {
                hashMap.put(aByte,hashMap.get(aByte) + 1);
            }
        }
//        System.out.println(hashMap);
        List<Node> list = new ArrayList<>();
        Iterator<Map.Entry<Byte, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Byte, Integer> next = iterator.next();
            Byte key = next.getKey();
            Integer value = next.getValue();
            list.add(new Node(key.toString(),value));
        }
        return list;
    }

    //整合方法 huffman 压缩
    public static byte[] huffmanZip(byte[] contents,Map<Byte, String> huffmanCodes){
        List<Node> nodesList = getNodesList(contents);

        Node huffmanTreeRoot = createHuffmanTree(nodesList);

        Map<Byte, String> codes = getCodes(huffmanTreeRoot);

        byte[] zip = zip(contents, codes);

        return zip;
    }

    public static byte[] zip(byte[] contents,Map<Byte,String> huffmanCodes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte aByte : contents) {
            stringBuilder.append(huffmanCodes.get(aByte));
        }
        int length = (stringBuilder.length() + 7)/8;
        byte[] bytes1 = new byte[length];
        int index = 0;
        for (int i = 0; i < stringBuilder.length(); i += 8) {
            String newStr;
            if (i+8 > stringBuilder.length()){
                newStr = stringBuilder.substring(i);
            }else {
                newStr = stringBuilder.substring(i,i+8);
            }
            bytes1[index++] = (byte) Integer.parseInt(newStr,2);
        }
       return bytes1;
    }

    //通过list创建一个HuffmanTree树,最后list只剩下一个根节点
    private static Node createHuffmanTree(List<Node> nodes) {
        while (nodes.size() > 1) {
            //对list排序
            Collections.sort(nodes);
            //取出最小的两个节点构成二叉树
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);
            //创建一颗新的二叉树,它的根节点 没有 data, 只有权值
            Node parent = new Node(null, leftNode.weight + rightNode.weight);
            parent.left = leftNode;
            parent.right = rightNode;
            //将已经处理的两颗二叉树从 nodes 删除
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            //将新的二叉树，加入到 nodes
            nodes.add(parent);
        }
        //nodes 最后的结点，就是赫夫曼树的根结点
        return nodes.get(0);
    }

    private static Map<Byte, String> getCodes(Node root){
        return getCodes(root,"",new StringBuilder());
    }
    //将传入的 node 结点的所有叶子结点的赫夫曼编码得到，并放入到 huffmanCodes 集合
    private static Map<Byte, String> getCodes(Node node, String code, StringBuilder stringBuilder) {
        StringBuilder sb = new StringBuilder(stringBuilder);
        sb.append(code);
        if (node != null) {
            if (node.data == null) {
                //向左递归
                getCodes(node.left, "0", sb);
                //向右递归
                getCodes(node.right, "1", sb);
            } else {
                huffmanCodes.put(Byte.valueOf(node.data), sb.toString());
            }

        }
        return huffmanCodes;
    }
}

//HuffmanTree的节点类
class Node implements Comparable<Node> {

    String data;
    int weight;

    Node left;

    Node right;

    public Node(String value, int weight) {
        this.data = value;
        this.weight = weight;
    }


    @Override
    public int compareTo(Node o) {
        return this.weight - o.weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                ", weight=" + weight +
                '}';
    }
}
