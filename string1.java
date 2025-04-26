class string1{
    public static void main(String[]args){
        StringBuilder str = new StringBuilder("hello");
        str.append("hello hii byee" );
        System.out.println(str.length());
        System.out.println(str.capacity());
    }
}