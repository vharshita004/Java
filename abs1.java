abstract class Payment{
 abstract void pay(int a);
 void sum(){
    System.out.println("Payment done ");
 }
}
class UpiPayment extends Payment{
   void pay(int a){
     System.out.println("payment via Uip =" + a);
   }
}
class CardPayment extends Payment{
    void pay(int a){
        System.out.println("payment via Card = " + a);
    }
}
class abs1{
    public static void main(String[] args){
       Payment obj = new UpiPayment();
         obj.pay(4000);
         obj.sum();
         System.out.println("\n");
       Payment obj1 = new CardPayment();
        obj1.pay(15000);
        obj1.sum();

    }
}