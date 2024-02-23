class Box
{
    int width,hight;
    Box(int w,int h)
    {
        width = w;
        hight = h;
    }
}
class BoxMain extends Box
{
    int depth;
    BoxMain(int w,int h,int d)
    {
        super(w,h);
        depth =d;
    }
    public int volume()
    {
        return width*hight*depth;
    }
}
class BoxSuperConstructerEx
{
    public static void main(String[] args) {
        BoxMain obj = new BoxMain(10, 20, 30);
        System.out.println("Volume is"+obj.volume());
    }
}