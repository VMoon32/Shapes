package oop.parcial2.shapes; //This one removed of the Main because marked error even tho are in the classes, hope that is not a problem.
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

    @Override
    public String toString(){
        return "▲";
    }
}
