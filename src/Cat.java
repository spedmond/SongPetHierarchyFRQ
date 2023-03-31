public class Cat extends Pet {
    private String name;
    public Cat(String name) {
        super(name);
    }

    public String speak() {
        return "meow";
    }
}
