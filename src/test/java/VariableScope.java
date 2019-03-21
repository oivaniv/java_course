public class VariableScope {

    static int x;

    public static void main(String[] args) {
        x = 5;
        System.out.println(x);
        doSomething();
        System.out.println(x);
    }

    static void doSomething(){
        x=10;
    }

    static void doSomethingLogic(){
        int y = 100;
    }
}
