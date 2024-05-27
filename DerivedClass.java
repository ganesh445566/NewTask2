package advanced.accessmodifiers;

public class DerivedClass extends BaseClass {
    @Override
    public void baseMethod() { // Overriding baseMethod with public access modifier
        System.out.println("Derived method in DerivedClass");
    }

    public int derivedVariable = 20; // public variable
}
