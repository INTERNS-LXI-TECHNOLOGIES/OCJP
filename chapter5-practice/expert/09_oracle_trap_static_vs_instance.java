/*
Expert-level Oracle trap about static vs instance.
Task:
1. Make this code compile.
2. Explain why the original version fails.
*/
public class OracleTrapStaticVsInstance {
    int value = 10;

    public static void main(String[] args) {
        // TODO: access value correctly
        System.out.println(value);
    }
}
