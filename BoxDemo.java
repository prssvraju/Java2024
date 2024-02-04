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
        b2.widith = 5;
        vol = b.widith*b.height*b.depth;
        //we need to Observe That we changed the b2.widht but
        // We used b.width to calculate  volume it chande so take away is
        // b2 will refer the b addresse where d2 dont have seperate memory
        // As b2 is reference variable and not a object(new operate not used) 
        System.out.println("Volume is "+vol);
    }
}