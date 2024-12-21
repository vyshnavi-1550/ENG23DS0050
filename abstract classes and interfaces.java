class Animal {
   public void sound() {
       System.out.println("Animal is making a sound");
   }
}

class Dog extends Animal {
   @Override
   public void sound() {
       System.out.println("Dog is barking");
   }
}

class Cat extends Animal {
   @Override
   public void sound() {
       System.out.println("Cat is meowing");
   }
}

public class InheritanceDemo {
   public static void main(String[] args) {
       Animal myDog = new Dog();
       Animal myCat = new Cat();

       myDog.sound();
       myCat.sound();
   }
}
