class a11{
    public static void main(String[]args){
        int a[]= {2,3,4,6,7};
        int b[]= {4,7,5,6,8};
        int merged = new int[a.length + b.length];
        for(int i = 0 ; i<a.length;i++)
        {
        merged[i]= a[i];
        }
        for(int i=0;i<b.length;i++){
            merged[a.length + i] = b[i];
        }
    }
}