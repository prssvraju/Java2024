public class StringBildVsBuffTime {
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
       
        StringBuffer  sbuff = new StringBuffer("java");
        for(int i=0;i<10000;i++)
        {
            sbuff.append("Raghu");
        }
        System.out.println("Time Take for Buffer is "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Java");
        for(int i=0;i<10000;i++)
        {
            sb.append("Raghu");
        }
        System.out.println("Time Take for Builder is "+(System.currentTimeMillis()-startTime));
        
        
    }
    
}
