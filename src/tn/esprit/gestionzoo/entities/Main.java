package tn.esprit.gestionzoo.entities;

public class Main {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin("Ocean", 25.5f);
        Penguin penguin = new Penguin("Sea", 15.8f);
        Dog dog = new Dog(4);
        Lion lion = new Lion(4);

        Zoo myZoo = new Zoo("Mon Zoo", "City Name");

        myZoo.addAnimal(dolphin);
        myZoo.addAnimal(penguin);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(lion);

        Dolphin anotherDolphin = new Dolphin("Ocean", 30.2f);
        myZoo.addAquaticAnimal(anotherDolphin);

        System.out.println("Animals in the Zoo:");
        myZoo.displayAnimals();

        System.out.println("Aquatic Animals Swimming:");
        myZoo.displayAquaticAnimalsSwimming();

        System.out.println("Maximum Penguin Swimming Depth: " + myZoo.maxPenguinSwimmingDepth());

        System.out.println("Number of Aquatics in the Zoo:");
        myZoo.displayNumberOfAquaticsByType();

        String searchName = "Lion";
        int animalIndex = myZoo.searchAnimal(searchName);
        if (animalIndex != -1) {
            System.out.println("Found at index: " + animalIndex);
        } else {
            System.out.println("Animal not found.");
        }

        myZoo.removeAnimal(lion);
        System.out.println("Animal removed from the zoo.");

        System.out.println("##########################");
        myZoo.displayAnimals();

        Zoo zooz = new Zoo("Pas Mon Zoo", "Another City Name");
        System.out.println(Zoo.comparerZoo(myZoo, zooz));
        System.out.println(myZoo.isZooFull());
    }
}
