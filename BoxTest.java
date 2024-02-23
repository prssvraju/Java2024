//Single Inheritance
class Box
{
    double width, height, depth;
    Box(double w, double h, double d)
    {
        width = w; height = h; depth = d;
    }
}
class BoxVolume extends Box
{
    BoxVolume(double w,double h,double d)
{
        super(w, h, d); //calling the super class constructor
    }
void boxVolume()
{
        double v = width * height * depth; System.out.println("The volume of the Box is " + v);
    }
}
class BoxTest
{
    public static void main(String args[])
    {
        BoxVolume bv = new BoxVolume(12.3, 13.2, 14.3);
        bv.boxVolume();
    }
}

