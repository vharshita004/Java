class a6{
    public static void main(String[] args){
        int a[]= {1,2,3,4};
        int b[]= {4,5,6,7};
        int sum[]= new int[a.length];
        
        for(int i=0;i<a.length;i++){
            sum[i] = a[i] + b[i];
        }
        System.out.print("Sum array: \n");
        for(int element : sum){
            System.out.println(element + " ");
        }
    }
}