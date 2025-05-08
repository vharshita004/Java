abstract class Shape{
   abstract void area();
}
class Circle extends Shape{
    int r=5;
   // double A;
    void area(){
        double A = 3.14 *r*r;
        System.out.println("area of circle : " +A);
    }
}
class Rectangle extends Shape{
      int l = 6;
      int b = 7;
     // double W;
      void area(){
       double  W = l*b;
        System.out.println("area of rectangle : " +W);
      }
}
class abs2{
    public static void main(String[] args){
        Shape s = new Circle();
        s.area();
        Shape s1 = new Rectangle();
        s1.area();
    }
}