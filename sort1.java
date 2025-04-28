class sort1{
    static void BubbleSort(int []a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                
            }
        }
        for(int element : a){
                System.out.println(element);
            }
    }
    public static void main(String[] args){
        int []a={22,4,7,8,9,5};
        BubbleSort(a);
       }
}  