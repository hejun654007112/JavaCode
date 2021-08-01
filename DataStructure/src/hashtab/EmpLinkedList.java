package hashtab;

public class EmpLinkedList {
    //头结点
    Employee head;

    public EmpLinkedList() {
        head = new Employee(-1,"");
    }

    //根据员工id从小到大添加元素
    public  void add(Employee employee){
        //判断当前链表是否为空
        if (isEmpty()){
            head.nextEmp = employee;
            return;
        }

        //查找插入位置
        Employee temp = head;
        while (true){
            //末尾插入
            if (temp.nextEmp == null){
                temp.nextEmp = employee;
                return;
            }

            if (employee.id >= temp.id && employee.id < temp.nextEmp.id){
                break;
            }
            temp =temp.nextEmp;
        }
        employee.nextEmp = temp.nextEmp;
        temp.nextEmp = employee;
    }

    //查找指定id的元素
    public Employee findById(int id){
        if (isEmpty()){
            return null;
        }

        Employee temp = head.nextEmp;

        while (true){

            if (temp.id == id){
                break;
            }
            if (temp.nextEmp == null){
                temp = null;
                break;
            }
            temp = temp.nextEmp;
        }
        return temp;
    }

    //删除指定id元素
    public void delById(int id){

        Employee temp = head;
        while (true){
            if (temp.nextEmp.id == id){
                temp.nextEmp = temp.nextEmp.nextEmp;
                break;
            }
            temp = temp.nextEmp;

            if (temp.nextEmp == null){
                System.out.println("没有找到");
                break;
            }
        }
    }

    //修改指定id元素的信息
    public void updateById(Employee employee){
        if (isEmpty()){
            System.out.println("没有找到~~");
            return;
        }
        Employee temp = head.nextEmp;
        while (true){
          if (temp.id == employee.id){
              temp.name = employee.name;
              break;
          }
            if (temp.nextEmp == null){
                System.out.println("没有找到");
                break;
            }
          temp = temp.nextEmp;

        }
    }

    public void print(){
        if (isEmpty()){
            System.out.println("链表为空~~");
            return;
        }

        Employee temp = head;
        while (true){
            if (temp.nextEmp == null){
                break;
            }
            temp = temp.nextEmp;
            System.out.print(" => id= " + temp.id +" name= " + temp.name);
        }
        System.out.println();
    }

    public  boolean isEmpty(){
        return head.nextEmp == null?true:false;
    }

    public static void main(String[] args) {
        EmpLinkedList empLinkedList = new EmpLinkedList();
        empLinkedList.add(new Employee(1,"tom"));
        empLinkedList.add(new Employee(3,"jack"));
        empLinkedList.add(new Employee(2,"milan"));
        empLinkedList.add(new Employee(0,"milan"));
//
//        empLinkedList.print();
//
//        System.out.println(empLinkedList.findById(4));
//
//        empLinkedList.delById(4);

        empLinkedList.updateById(new Employee(3,"jun"));

        empLinkedList.print();
    }
}
