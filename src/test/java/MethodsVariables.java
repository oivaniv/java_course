public class MethodsVariables {

    public static void main(String[] args){
        sayHelloWorld();

        sayHelloWorldWithString("Ukraine");
        sayHelloWorldWithString("Russia");

        int x = returnFive();

        int result = square(6);
        System.out.println(result);

        int secondResult = square(returnFive());
        System.out.println(secondResult);


    }
    static int square(int x){
        return x*x;
    }

    static int returnFive(){
        return 5;
    }

    static void sayHelloWorld(){
        System.out.println("Hello world");
    }

    static void sayHelloWorldWithString(String name){
        System.out.println("Hello World " + name);
    }

}
