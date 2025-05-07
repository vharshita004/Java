import java.io.Console ;
class console{
   public static void main(String[] args){
        String[] y = new String[4];
        for(int i=0;i<y.length;i++){
            System.out.println(y[i]);
        }
        Console x = System.console();
        for(int i=0;i<y.length;i++)
        y[i] = x.readLine();
        System.out.println("~~~~~~~~~~~~");

        for(int i=0;i<y.length;i++)
        System.out.println(y[i] + "~");
    }
}
