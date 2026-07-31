public class Circle{

    float pi = 3.14;
    float radius;

    void setRadius(float rad){
        radius = rad;
    
    }
    float calculateArea(){
        float area = pi*radius*radius;
        return area;

    }
    public static void main(String args[]){
        Circle c1 = new Circle();
        c1.setradius(3.0f);
        float area = c1.calculateArea();

        System.out.println("Area of circle = " + area);
    }
}