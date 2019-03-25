public class clockRunner {
    static Thread thread = new Thread();
    public static void main(String[] args) throws InterruptedException{
        Clock a = new Clock(5,10,12);
        System.out.println(a.printTime());

        //long time= System.currentTimeMillis();
        //System.out.println(time*.001);
        for(int i = 0; i <60; i++){
            thread.sleep(1000);
            System.out.println(i);
        }
    }
}
