//common element
class a8{
    public static void main(String[]args){
        int a[] = {1,2,3,4,5};
        int b[] = {3,6,5,7,8};
        System.out.println("Common Element:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}