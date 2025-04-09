class typecast{
    public static void main(String[] args){
       //automatic conversion
        byte a = 127;
        int b = a;
        System.out.println(b);
        
        //non-automatic conversion
        int c = 50000;
        short d = (short)c;
        System.out.println(d);
    }
}