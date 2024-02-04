class Box
{
    int widith;
    int height;
    int depth;
}
class BoxDemo
{
    public static void main(String args[])
    {
        Box b =new Box();
        Box b2 = b;
        b.widith=2;
        b.height=1;
        b.depth=4;

        double vol = b.widith*b.height*b.depth;
        System.out.println("Volume is "+vol);
        b.widith = 5;
        vol = b.widith*b.height*b.depth;
        System.out.println("Volume is "+vol);

        


    }
}