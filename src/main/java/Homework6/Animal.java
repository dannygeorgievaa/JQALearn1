package Homework6;

public abstract class Animal {
    public abstract void play();

    public static class Bird extends Animal {
        public void play() {
            System.out.println("The bird plays with a toy on a string.");
        }

        public void fly() {
        }

        public void sing() {
        }

        public void sing(int numBirds) {
            if (numBirds == 2) {
            } else if (numBirds == 3) {
                System.out.println("Three birds sing louder than two.");
            } else if (numBirds == 5) {
                System.out.println("Five birds sing louder than three.");
            } else {
                System.out.println("The birds are singing together.");
            }
        }
    }

    public static class Dog extends Animal {
        @Override
        public void play() {
            System.out.println("The dog plays....");
        }
        public void bringStick() {
            System.out.println("Dog bring sticks.");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void play() {
            System.out.println("The cattt plays....");
        }
        public void climb(){
            System.out.println("Cats love to climb.");
        }
    }




}

