public class DemoObject {

    public void run() {

    }



    public static void main(String[] args) throws Exception {
        
        Object o1 = new Object();
        System.out.println(o1.toString());

        DemoObject do1 = (DemoObject) o1;
        do1.run();

        DemoObject do2 = new DemoObject();
        Object o2 = do2;



    }
}
