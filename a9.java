class a9{
    public static void main(String[]args){
        int a[] = {1,2,3,4};
        int b[] = new int[a.length];
        for (int i=0;i<a.length;i++){
            b[i] = a[i];
        }
        System.out.println("Copied array:");
        for(int element : b){
            System.out.print(element + " ");
        }
    }
}