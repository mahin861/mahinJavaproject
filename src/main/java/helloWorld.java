public class helloWorld {
    public int x = 2;
    public static String empNo = "LK0083073";

    public void printVariable() {
        System.out.println("value of x:" + x);
    }

    public static void funtion2(){
        System.out.println("value of String" + "="+ empNo);
    }

    public static void main(String[] arg) {
        helloWorld obj = new helloWorld();
        obj.printVariable();
        obj.funtion2();

    }
}
