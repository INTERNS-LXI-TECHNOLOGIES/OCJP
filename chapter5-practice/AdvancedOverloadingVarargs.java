// Advanced-level incomplete practice
// Goal: practice overload resolution, varargs, autoboxing, and object mutation.
// TODO: complete each method so it matches the example behavior.

public class AdvancedOverloadingVarargs {
    static void show(int value) {
        // TODO: print "int"
        throw new UnsupportedOperationException("Implement me");
    }

    static void show(long value) {
        // TODO: print "long"
        throw new UnsupportedOperationException("Implement me");
    }

    static void show(Integer value) {
        // TODO: print "Integer"
        throw new UnsupportedOperationException("Implement me");
    }

    static int sum(int... values) {
        // TODO: sum all provided integers
        throw new UnsupportedOperationException("Implement me");
    }

    static void changeName(StringBuilder name) {
        // TODO: append " Jr." to the given StringBuilder
        throw new UnsupportedOperationException("Implement me");
    }

    public static void main(String[] args) {
        show(10);
        System.out.println(sum(1, 2, 3, 4));

        StringBuilder builder = new StringBuilder("Alice");
        changeName(builder);
        System.out.println(builder);
    }
}
