package bai4;

public class run {
    public static void main(String[] args) {
        Shape shape=new Shape("red",true);
        System.out.println(shape);
        Triangle triangle=new Triangle("grenn",true,3,4,5);
        System.out.printf(triangle.toString());
    }
}
