class t1{
    t1(){ 
    System.out.println(this + "--- inside D constructor");
    }
    {
        System.out.println(this + "--- inside D int block");
    }
    public static void main(String[] args){
        System.out.println("---- main start");

        t1 x = new t1();
        System.out.println(x + "--- inside D main method");
        

        System.out.println("---- main end");
        
    } 
}