public class LoudDog extends Dog {
    private String name;

    public LoudDog(String name) {
        super(name);
    }

    public String speak() {
        return super.speak() + " " + super.speak();
    }
}
