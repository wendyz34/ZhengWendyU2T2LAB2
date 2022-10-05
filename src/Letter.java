public class Letter {
    // instance variables
    /* none yet! */
    private String from;

    // constructor; since there are no instance variables to
    // initialize, this constructor has no parameters and is "empty".
    // to call this no-parameter constructor use: new Letter();
    public Letter(String from) {
        this.from = from;
    }
    public void writeLetter(String toName){
        greeting(toName);
        specialMessage();
        closing();
    }

    /* add your writeLetter method here: TO BE IMPLEMENTED IN PART 4 */

    public void greeting(String name) {
        System.out.println("Hello, friend!" + name);
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
        System.out.println("From, " + from);
    }
}


