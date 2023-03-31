public class Dog extends Pet {
    private String name;

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "woof!";
    }
}
