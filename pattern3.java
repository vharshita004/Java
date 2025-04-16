class pattern3{
    public static void main(String[] args){
        int i,j,space;
        for(i=1;i<=8;i++){
            for(space = 2; space<=i; space++){
            System.out.print(" ");
            }
            for(j=1;j<=8-i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
}