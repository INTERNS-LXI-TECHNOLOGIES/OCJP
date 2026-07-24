/*
Expert-level Oracle trap.
Task:
1. Determine which access modifier is being tested.
2. Fix the code so it compiles.
3. Explain why the original version fails.
*/
public class OracleTrapAccessModifiers {
    private void secret() {
        System.out.println("secret");
    }

    public static void main(String[] args) {
        // TODO: call secret() from here
    }
}
