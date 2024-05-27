package advanced.accessmodifiers;

public class BaseClass {
    protected void baseMethod() {
        System.out.println("Base method in BaseClass");
    }

    private int baseVariable = 10; // private variable

    public int getBaseVariable() {
        return baseVariable; // To access private variable outside the class, use a public getter
    }
}
