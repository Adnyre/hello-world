public class HelloWorld {
    private static String s = "Hello world!";
    public static void main(String[] args) {
        System.out.println(s);
        Test.printTest();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Test.exit();
    }
}
