package src;

public class Pet {
    private String name;
    private String breed;
    private int age;
    private boolean isAdopted;

    public Pet(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isAdopted = false;
    }

    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    public boolean isAdopted() { return isAdopted; }

    public void setAdopted(boolean adopted) { isAdopted = adopted; }
}
