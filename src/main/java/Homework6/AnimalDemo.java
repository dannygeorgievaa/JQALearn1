package Homework6;

public class AnimalDemo {
   static class Dog implements IAnimal {
        public void makeSomeNoise() {
            System.out.println("The dog from the interface says: bark ");
        }
    }
    public static void main(String[] args) {
        Animal.Bird myBird = new Animal.Bird();
        myBird.sing(5);
        myBird.play();

        Dog myDog = new Dog();
        myDog.makeSomeNoise();

        Animal.Dog myDogAbstractClass = new Animal.Dog();
        myDogAbstractClass.bringStick();

        Animal.Cat myCatAbstractClass = new Animal.Cat();
        myCatAbstractClass.climb();


    }
}
