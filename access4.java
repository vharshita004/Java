class Rectangle{
    private float length;
    private float width;
    void SetData(float length,float width){
        this.length = length;
        this.width = width;
    }
    void GetData(){
        float area = length*width;
        System.out.println("area of rectangle: " + area);
        float parameter ;
        parameter = (length + width)*2;
        System.out.println("parameter of rectangle: " + parameter);
        
    }
}
class access4{
    public static void main(String[] args){
        Rectangle x = new Rectangle();
        x.SetData(4.5f,2f);
        x.GetData();
    }
}