
public class HelloPerson {
    private final String name;
    public HelloPerson(String name) {
        this.name = name;
    }

    public String say(){
        return "Hello " + name;
    }
}
