package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Welcome to the Online Pet Adoption Center ===");

        // Sample object creation to show project scope
        Pet samplePet = new Pet("Buddy", "Golden Retriever", 2);
        System.out.println("Featured Pet: " + samplePet.getName() + " (" + samplePet.getBreed() + ")");
        System.out.println("System Status: Ready for Review 1");
    }
}
