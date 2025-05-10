class Employee{
    private String name;
    private int Id;
    private float salary;
    void SetData(String name,int Id,float salary){
        this.name = name;
        this.Id = Id;
        this.salary = salary;
    }
    void GetData(){
        System.out.println("Name of employe : " + name);
        System.out.println("Id : " + Id);
        System.out.println("Salary : " + salary);
    }
}
class access3{
    public static void main(String[] args){
        Employee x = new Employee();
        x.SetData("raju",002345,4500000);
        x.GetData();
    }
}