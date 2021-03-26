package ro.fasttrackit.curs7;

public class Main {
    public static void main(String... args) {
        Clock myClock = new Clock(18, 54);

        System.out.println(myClock.readTime());
        System.out.println(myClock.getHour());
        System.out.println(myClock.getMinutes());
        myClock.setMinutes(myClock.getMinutes() + 1);
        System.out.println(myClock.getMinutes());

        Clock secondClock = new Clock(10);
        System.out.println(secondClock.readTime());

        secondClock.setMinutes(99);
        secondClock.setHour(32);

        System.out.println(secondClock.readTime());

        Clock brokenClock = new Clock(99, 99);
        System.out.println(brokenClock.readTime());
        brokenClock.setHour(98);
        brokenClock.setMinutes(98);
        System.out.println(brokenClock.readTime());
        brokenClock.setMinutes(-99999);
        System.out.println(brokenClock.readTime());

        brokenClock.addMinutes(12332131);
        System.out.println(brokenClock.readTime());

        brokenClock.TIP = "BUZUNAR";  //asa nu
        System.out.println(secondClock.TIP); //asa nu
        System.out.println(Clock.TIP); //asa da
        brokenClock.present();
        Clock.present();
    }
}
