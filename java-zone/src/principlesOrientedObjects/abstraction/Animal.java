package principlesOrientedObjects.abstraction;

abstract class Animal {
    /**
     * | The main abstract class |
     * It is good to use abstract in a way that we can achieve security - hide certain details and only show the
     *      the important details of an object.
     */
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz...");
    }

    public void eat() {
        System.out.println("Chomp, Chomp...");
    }
}