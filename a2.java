class a2{
    public static void main(String[]args){
        //displaying an array
        //First way
        int a[]={3,45,6,2};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println("\n");


        //Second way(using for loop)
        int b[]={23,56,45,33,66,11,};
        System.out.println(b.length);
        System.out.println("\n");
        for(int i=0;i<b.length;i++ ){
            System.out.println(b[i]);
        }
       System.out.println("\n");


       //Third way(using for-each loop)
      String student[]={"mohan","sohan","roshan","lohan"};
      for(String element: student){
        System.out.println(element);
      }
    }
}