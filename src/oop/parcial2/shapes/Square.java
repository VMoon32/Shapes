package oop.parcial2.shapes;

public class Square extends Shape{
    private float side;

    public Square(float side) //removí el "final", no llevaba ahí
    {
        super("Square");//removí el ", "■);", no llevaba ahí
        this.side = side;
    }

    public float getArea(){
        return side * side;
    }
    public float getPerimeter(){
        return (side * 4);
    }

    public float getSidesCount()
    {
        return 4;
    }

    @Override
    public String toString(){
        return "■";
    }
}
