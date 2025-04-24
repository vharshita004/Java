class a5{
    //sum of elements of array
    //1D array
    public static void main(String[] args){
        float n[] = {34.5f,45.5f,32.5f,6.5f,2.5f};
        float sum = 0f;
        for(int i=0;i<n.length;i++){
             sum = sum + n[i];
        }
        System.out.println(sum);
        System.out.println(" ");

     //2D array   
     int a[][] ={
        {11,22,33},
        {44,55,66},
        {77,88,99}
        };
        int add = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               add= add + a[i][j];
            }
        }
        System.out.println(add);
    }

}   