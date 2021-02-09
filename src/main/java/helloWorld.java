public class helloWorld {
    public int x = 2;

    public void printVariable() {
        System.out.println("value of x:" + x);
    }

    public static void main(String[] arg) {
        helloWorld obj = new helloWorld();
        obj.printVariable();

    }
}