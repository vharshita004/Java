// compare two arrays
class a7{
    public static void main(String[]args){
        int arr1[]={23,45,56,78};
        int arr2[]={23,45,56,78};
        boolean isEqual = java.util.Arrays.equals(arr1 , arr2);
        if(isEqual)
        System.out.println("arrays are equal");
        else
        System.out.println("arrays are not equal");
    }
}