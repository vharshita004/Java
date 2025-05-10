class Atm{
   private int a;
   public void SetRupees(int a){
     this.a = a;
   }
   public int GetRupees(){
    return a;
   }
}
class access1{
   public static void main(String[] args){
    Atm x = new Atm();
    x.SetRupees(1000);
    System.out.println(x.GetRupees());
   }
}