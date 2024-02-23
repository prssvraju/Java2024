class Animal
{
    String color="white";
    public void eat()
    {
        System.out.println("Eating ...");
    }
}
class Dog extends Animal
{
    String color="black";
    public void eat()
    {
        System.out.println("Eating  Boands");
    }

    public void print()
    {
        System.out.println("Local Color is "+color);
        eat();
    }
    public void printSuper()
    {
        System.out.println("Local Color is "+super.color);
        super.eat();
    }
}
class AnimalSuperMemberEx
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.print();
        System.out.println("-------");
        d.printSuper();
    }
}