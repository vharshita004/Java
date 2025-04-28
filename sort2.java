class sort2{
    static void sorted(int a[]){
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
            System.out.println("sorted array :" element);
            System.out.println("~~~~~~~~~~~");
        }
        static int BinarySearch(element){
         int target = 33;
         int start= 0;
         int end= a.length-1;   
        int mid =((start + end)/2);
        if(mid==target){
            return mid;
          }
          else if(mid>target){
             mid = mid + 1;
          }
          else if(mid<target)
          mid = mid-1;
        } 

    }
}