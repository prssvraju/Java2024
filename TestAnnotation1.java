class Animal1{  
void eatSomething(){System.out.println("eating something");}  
}  
  
class Dog1 extends Animal1{  

void eatsomething(){System.out.println("eating foods");}//should be eatSomething  
}  
  


class TestAnnotation1{  
    public static void main(String args[]){  
        //Animal a=new Dog();
        Dog1  d = new Dog1();  
        //a.eatSomething();  
        d.eatSomething();
    }
}