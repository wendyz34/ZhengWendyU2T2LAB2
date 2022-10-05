public class Cat {
    private String name;
    private String food;

    public Cat(String name) {
        this.name = name;
    }

    public void feed(String food) {
        System.out.println("Yum!" + name + "loves" +food + "!");
    }

    public void introduce() {
        // write me!
        //System.out.println("Hello, my name is " +name + "!");
    }
}
