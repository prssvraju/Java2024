class CmdFact
{
    public static void main(String args[])
    {

        int n = Integer.parseInt(args[0]);
        CmdFact obj =new CmdFact();
        int res = obj.fact(n);
        System.out.println("Fact of "+n+"is : "+res);
    }
    public int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}