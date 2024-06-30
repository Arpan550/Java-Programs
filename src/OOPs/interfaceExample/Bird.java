package OOPs.interfaceExample;

public abstract class Bird implements Flyable {
    private final String breed;

    public Bird(String breed) {
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }
}
