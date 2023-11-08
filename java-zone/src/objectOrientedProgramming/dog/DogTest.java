package objectOrientedProgramming.dog;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Mel", "Shitzu");
        Dog dog2 = new Dog("Snoopy", "Beagle");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

        System.out.println("\nSet the new Breed of dog1 and the new name of dog2: ");
        dog1.setBreed("Labrador Retrivier");
        dog2.setName("Daisy");

        System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");
    }
}
