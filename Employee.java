class employee{
    int empId;
    String name;
    String department;
    double salary;

    employee(int empId,String name,String department,double salary){
        this.empId = empId;
        this.name =name;
        this.department = department;
        this.salary = salary;
    }
    void display(){
        System.out.println("Name of the employee: "+name);
        System.out.println("Id of the employee: "+empId);
        System.out.println("Department of the employee: "+department);
        System.out.println("salary of the employee: "+salary);
    }
}

public class Employee{
    static ArrayList<employee> eList=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void add(){
         System.out.println("Enter name: ");
         String name = sc.nextLine();
        
        System.out.println("Enter employee id: ");
         int empId = sc.nextInt();
         sc.nextLine();

           System.out.println("Enter department: ");
         String department = sc.nextLine();
        
           System.out.println("Enter salary: ");
         double salary = sc.nextDouble();
         sc.nextLine();

         employee.add(new employee(name,empId,department,salary));
         
        
    }
    public static void search()
    {
        System.out.println("Enter the employee id to find: ");
        int id =sc.nextInt();
        sc.nextLine();
        for(employee e: eList){
            if(e.empId == id ){
                e.display();
            }
        }
    }
    //This deletes the employee details of the given employee ID
    public static void delete()
    {
        System.out.println("Enter emp id to delete:");
        int delete=sc.nextInt();
        int idx=0;
        sc.nextLine();
        for (employee e : eList)
        {
            if(e.empID == delete)
            {
                eList.remove(idx);
            }
            idx++;
        }
    }
    //This function updates all the values of a particular employee ID and updates it in the same ID.
    public static void update()
    {
        System.out.println("Enter emp id to update:");
        int update=sc.nextInt();
        int idx=0;
        sc.nextLine();
        String nName;
        String nDept;
        String nSalary;
        for (employee e : eList)
        {
            if(e.empID == update)
            {
                System.out.println("Enter new name:");
                nName=sc.nextLine();
                System.out.println("Enter new department:");
                nDept=sc.nextLine();
                System.out.println("Enter new Salary:");
                nSalary=sc.nextLine();
                eList.set(idx, new employee(e.empID, nName, nDept, nSalary));
                break;
            }
            idx++;
        }
    }
    public static void dispAll()
    {
        for(employee e : eList)
        {
                e.display();
        }
    }

    public static void main(String[] args){
        int choice;
        boolean menu= true;
        while(menu)
        {
            System.out.println("Employee Management\n 1.Add\n2.Search\n3.Update\n4.Delete\n5.Display all employees\n6.Exit\nEnter choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    eList.add();
                    break;
                case 2:
                    eList.search();
                    break;
                case 3:
                    eList.update();
                    break;
                case 4:
                    eList.delete();
                    break;
                case 5:
                    eList.dispAll();
                    break;
                case 6:
                    menu=false;
                    break;
                default:
                    System.out.println("Enter only numbers from 1 to 6");
            }
        }
    }
}

