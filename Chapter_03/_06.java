package Chapter_03;

import java.util.LinkedList;

public class _06 {
    public static abstract class Animal {
        private int order;
        public String name;

        public Animal(String n) {
            name = n;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int ord) {
            order = ord;
        }
    }

    public static class Dog extends Animal {
        public Dog(String n) {
            super(n);
        }
    }

    public static class Cat extends Animal {
        public Cat(String n) {
            super(n);
        }
    }

    public static class AnimalQueue {
        private LinkedList<Dog> dogs = new LinkedList<Dog>();
        private LinkedList<Cat> cats = new LinkedList<Cat>();
        private int order = 0;

        public void enqueue(Animal animal) {
            animal.setOrder(order);
            order++;

            if (animal instanceof Dog)
                dogs.add((Dog)animal);

            else if (animal instanceof Cat)
                cats.add((Cat)animal);
        }

        public Animal dequeueAny() {
            if (dogs.size() == 0)
                return dequeueCat();
            
            if (cats.size() == 0)
                return dequeueDog();

            Dog dog = dogs.getFirst();
            Cat cat = cats.getFirst();

            if (dog.getOrder() < cat.getOrder()) 
                return dequeueDog();

            return dequeueCat();
        }

        public Dog dequeueDog() {
            return dogs.poll();
        }

        public Cat dequeueCat() {
            return cats.poll();
        }
    }
}