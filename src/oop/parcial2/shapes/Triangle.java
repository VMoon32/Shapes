package oop.parcial2.shapes; //This one removed of the Main because is outside the package, espero esté bien?
//Lados iguales

public class Triangle extends Shape{

    private float height;
    private float base;

    public Triangle(float height, float base)
    {
        super("Triangle");
        this.height = height;
        this.base = base;
    }

    public float getArea(){
        return (base * height / 2);
    }
    public float getPerimeter(){
        return (base * 3);
    }

    public float getSidesCount()
    {
        return 3;
    }
}
