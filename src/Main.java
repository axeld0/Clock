import model.Clock;

public class Main {
    public static void main(String[] args) {

        //a.
        Clock newClock = new Clock();
        String time= newClock.setTime();
        System.out.println("now : ");
        System.out.println(time);
        //b.
        String newTime =newClock.aSecondFurther();
        System.out.println("a second later...");
        System.out.println(newTime);
        System.out.println("a second ago...");
        String pastTime = newClock.aSecondAgo();
        System.out.println(pastTime);
        //c.
        




    }
}