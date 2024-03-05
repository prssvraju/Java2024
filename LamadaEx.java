@FunctionalInterface
interface Fun
{
    void show();
}
class LamadaEx
{
    public static void main(String[] args) {
        //Anonymous Funtion
        // Fun obj = new Fun() {
        //     public void show()
        //     {
        //         System.out.println("Hello");
        //     }
        // };
         // Lamada Function
        Fun obj=()->
        {
            System.out.println("Hello");
        };

        obj.show();
    }
}