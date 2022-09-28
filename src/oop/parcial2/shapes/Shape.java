package oop.parcial2.shapes;

public abstract class Shape {
    private String name;
    //private String shape; asi no salio la figura
    protected Shape(String name)
    {
        this.name = name;
    }
    public final String getName(){
        return name;
    }

    public abstract float getArea();
    public abstract float getPerimeter();
    public abstract float getSidesCount();
}
