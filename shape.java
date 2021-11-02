abstract class Shapes{
    abstract void draw();
    {

    }
}
class Line extends Shapes
{
    public void draw()
    {
        System.out.println("draw Line");
    }

}
class Rectangle extends Shapes
{
    public void draw()
    {
        System.out.println("draw rectangle");
    }
}
    class  Circle extends Shapes
    {
        public void draw()
        {
              System.out.println("draw circle");
        }

    }

class  Cube extends Shapes
{
    public void draw()
    {
        System.out.println("draw cube");
    }

}
class shape{
    public static void main(String[] args) {
        Shapes obj=new Line();
        obj.draw();
        Shapes obj1=new Rectangle();
        obj1.draw();
        Shapes obj2=new Circle();
        obj2.draw();
        Shapes obj3=new Cube();
        obj3.draw();
    }

}


