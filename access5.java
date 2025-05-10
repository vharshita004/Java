class temp{
    private float celsius;
    public void getC(float celsius){
        this.celsius = celsius;
    }
    public void CtoF(){
        float F = celsius*(9/5)+32;
        System.out.println(F);
    }
}
class access5{
    public static void main(String[] args){
        temp t = new temp();
        t.getC(45F);
        t.CtoF();
    }
}

