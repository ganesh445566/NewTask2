package advanced.accessmodifiers;
//import advanced.accessmodifiers.DerivedClass;

public class OutsideClass {
    public static void main(String[] args) {
        DerivedClass derivedObj = new DerivedClass();

        // Attempting to access baseMethod
        derivedObj.baseMethod(); // Accessible because it's overridden as public

        // Attempting to access baseVariable
        // System.out.println(derivedObj.baseVariable); // Not accessible directly, private in BaseClass
        System.out.println("Base variable through getter: " + derivedObj.getBaseVariable()); // Accessible via public getter

        // Attempting to access derivedMethod
        derivedObj.baseMethod(); // Accessible because it's public

        // Attempting to access derivedVariable
        System.out.println("Derived variable: " + derivedObj.derivedVariable); // Accessible because it's public
    }
}
