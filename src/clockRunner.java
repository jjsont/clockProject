public class clockRunner {
    public static void main(String[] args){
        Clock a = new Clock(5,10,12);
        System.out.println(a.printTime());

        long time= System.currentTimeMillis();
        System.out.println(time*.001);
        a.timer();
    }
}
