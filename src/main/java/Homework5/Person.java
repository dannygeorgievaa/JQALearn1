package Homework5;

public class Person {
        private String name;
        private int age;
        private boolean isMan;

        public Person(String name, int age, boolean isMan) {
            this.name = name;
            this.age = age;
            this.isMan = isMan;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public boolean getIsMan() {
            return this.isMan;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setIsMan(boolean isMan) {
            this.isMan = isMan;
        }

        public void showPersonInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Is Man: " + this.isMan);
    }


}
