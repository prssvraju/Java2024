class PrimeNum
{
    public static void main(String args[])
    {
        PrimeNum obj = new PrimeNum();
        for(int i=3;i<100;i++)
        {
            if(obj.isPrime(i))
            {
                System.out.println(i+": is a prime number");
            }
        }
    }
    public boolean isPrime(int num)
    {
        //Consider Every number is prime
        boolean flag=true; 
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                //when ever reminder is 0
                //considered it is not a prime
                flag=false;
            }
        }
        return flag;
        
    }

}