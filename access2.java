class Student1{
    private String name;
    private int marks;
    public void set(String name , int marks){
        this.name = name;
        this.marks = marks;
    }
    public void get(){
        System.out.println("Name of student: " + name);
        System.out.println("Marks: " + marks);
    }
}
class access2 extends Student1{
    public static void main(String[] args){
    Student1 x = new Student1();
    x.set("mohan", 75);
    x.get();
    }
}