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
    public static void delete()
    {

    }
    public static void update()
    {

    }
    public static void disp()
    {
        
    }
    //add()
    //search()
    //delete()
    //update()
    public static void main(String[] args){
        ArrayList<employee> Elist = new ArrayList<>();
        

    }
}

