package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Graph {
    private ArrayList<String> vertexList;//存储顶点集合
    private int[][] edges;//存储图对应的领结矩阵
    private int numOfEdges;//边的个数
    private boolean[] isVisited;

    public Graph(int n) {
        vertexList = new ArrayList<>();
        edges = new int[n][n];
        isVisited = new boolean[n];
    }

    //返回边的个数
    public int getNumOfEdges() {
        return numOfEdges;
    }

    //返回索引的顶点
    public String getValueOfIndex(int i) {
        return vertexList.get(i);
    }

    //返回指定的权值
    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }

    //返回顶点的个数
    public int getNumOfVertex() {
        return vertexList.size();
    }

    //插入一个顶点
    public void insertVertex(String s) {
        vertexList.add(s);
    }

    //添加边
    public void insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

    //显示图对应的矩阵
    public void showGraph() {
        for (int[] edge : edges) {
            System.out.println(Arrays.toString(edge));
        }
    }

    //深度优先遍历,获取第一个领结节点
    public int getFirstNeighbor(int i){
        for (int i1 = 0; i1 < vertexList.size(); i1++) {
            if (edges[i][i1] > 0){
                return i1;
            }
        }
        return -1;
    }
    // //深度优先遍历,获取下一个领结节点
    public int getNextNeighbor(int v1,int v2){
        for (int i = v2 + 1; i < vertexList.size(); i++) {
            if (edges[v1][i] > 0){
                return i;
            }
        }
        return -1;
    }
    //深度优先遍历
    private void dsf(boolean[] isVisited, int i){
        System.out.println(getValueOfIndex(i) + "->");
        isVisited[i] = true;
        int w = getFirstNeighbor(i);
        while (w != -1){
            if (!isVisited[w]){
                dsf(isVisited,w);
            }
            w = getNextNeighbor(i, w);
        }
    }
    //深度优先遍历,重载
    public void dsf(){
        for (int i = 0; i < vertexList.size(); i++) {
           if (!isVisited[i]){
               dsf(isVisited,i);
           }
        }
    }

    //广度优先遍历
    private   void bfs(boolean[] isVisited,int i){
        int u;
        int w;
        LinkedList<Integer> queue = new LinkedList<>();
        System.out.println(getValueOfIndex(i) + "->");
        isVisited[i] = true;
        queue.push(i);


        while (!queue.isEmpty()){
            u = queue.poll();
            w = getFirstNeighbor(u);
            while (w != -1){
                if (!isVisited[w]){
                    System.out.println(getValueOfIndex(w) + "->");
                    isVisited[w] = true;
                    queue.push(w);
                }
                w = getNextNeighbor(u,w);
            }
        }
    }
    //广度优先遍历,重载
    public  void bfs(){
        for (int i = 0; i < vertexList.size(); i++) {
            if (!isVisited[i]){
                bfs(isVisited,i);
            }
        }
    }
    public static void main(String[] args) {
        //测试一把图是否创建 ok
        int n = 5;
        //结点的个数
        String[] strings = {"A", "B", "C", "D", "E"};
//        String Vertexs[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
        //创建图对象
        Graph graph = new Graph(n);
        //循环的添加顶点
        for (String vertex : strings) {
            graph.insertVertex(vertex);
        }
        //添加边
        // A-B A-C B-C B-D B-E //
        graph.insertEdge(0, 1, 1); // A-B
        graph.insertEdge(0, 2, 1);
        graph.insertEdge(1, 2, 1);
        graph.insertEdge(1, 3, 1);
        graph.insertEdge(1, 4, 1); //
        graph.showGraph();

//        graph.dsf();
        graph.bfs();
    }
}
