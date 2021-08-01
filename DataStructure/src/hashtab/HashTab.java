package hashtab;

/**
 * 哈希数组,采用散列函数
 */
public class HashTab {
    private EmpLinkedList[] linkedLists;

    int size;

    public HashTab(int size) {
        linkedLists= new EmpLinkedList[size];
        this.size = size;
        //重要 重要 ,为每一条链表进行初始化
        for (int i = 0; i < size; i++) {
            linkedLists[i] = new EmpLinkedList();
        }
    }

    //添加元素
    public void  addById(Employee employee){
        //通过 取模算法对id进行散列
        int index = employee.id % size;
        linkedLists[index].add(employee);
    }
    //查找指定id元素

    public Employee findById(int id){
        int index = id % size;
        return linkedLists[index].findById(id);
    }
    //修改指定id元素

    public void updateById(Employee employee){
        int index = employee.id % size;
        linkedLists[index].updateById(employee);
    }
    //删除指定id元素

    public void delById(int id){
        linkedLists[id%size].delById(id);
    }

    //遍历哈希表
    public void printHash(){
        for (int i = 0; i < linkedLists.length; i++) {
            linkedLists[i].print();
        }
    }

    public static void main(String[] args) {
        HashTab hashTab = new HashTab(5);

        hashTab.addById(new Employee(1,"tom"));
        hashTab.addById(new Employee(3,"jack"));
        hashTab.addById(new Employee(2,"milan"));
        hashTab.addById(new Employee(0,"milan"));
        hashTab.addById(new Employee(6,"yalan"));

        hashTab.delById(2);

        System.out.println(hashTab.findById(6));

        hashTab.updateById(new Employee(2,"minglan"));
        hashTab.printHash();
    }
}
