class a16{
    public static void main(String[] args){
        int x[]={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<x.length;i++)
          sum = sum + x[i];
        System.out.println(sum);
        System.out.println("~~~~~~~~~~");
        int add = 0;
        for(int next : x)
          add = add + next;
         System.out.println(add);
         
    }

}
