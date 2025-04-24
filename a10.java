class a10{
    public static void main(String[] args){
        int a[] = {1,2,3,4};
        int b[] = {3,6,7,8};
        int max= Integer.MIN_VALUE;
        for(int val: a){
            if(val>max){
                max=val;
            }
        }
       for(int val : b){
        if(val>max){
            max=val;
        }
       } 
       System.out.println("max element : " + max);
    }
}