class Rectangle
{

                        // Class(Private) consists of
                        // 1.Properties
                        // 2. Constructors
                        // 3.Methods
    // Properties
    private double length;
    private double breadth;

    // Constructors => Not use void/int Only Public/Private.
    // Without Parameter Constructor & Name of Constructor must be same as that of the Class.
    public Rectangle() {
        length = 1;
        breadth = 1;
    }
    // With Parameter Constructor.
    public Rectangle(double l, double b) {
        setLength(l);
        setBreadth(b);
    }

    // Property  Methods are Getter & Setter.
    public double getLength()
    {
        return length;
    }
    
    public double getBreadth()
    {
        return breadth;
    }
    
    public void setLength(double l)
    {
        if(l>=0)
            length=l;
        else
            length=0;
    }
    
    public void setBreadth(double b)
    {
        if(b>=0)
            breadth=b;
        else 
            breadth=0;
    }
    // Methods.
    public double area()
    {
        //return length*breadth;
        return getLength()*getBreadth();
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else 
            return false;
    }
}
        

public class Data_Hiding {

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(10.5);//check with negative values.
        r.setBreadth(5.5);
        
        System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is Square "+r.isSquare());
        
        System.out.println("Length "+r.getLength());
        System.out.println("Breadth "+r.getBreadth());
    }
    
}
