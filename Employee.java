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
}

public class Employee{
    static ArrayList<employee> eList=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void add(){
        
    }
    public static void search()
    {

    }
    public static void delete()
    {

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
    //add()
    //search()
    //delete()
    //update()
    public static void main(String[] args){
        

    }
}

