import javax.swing.*;

public class HO extends JFrame  {
    public static void main(String[] args) {
        try {
            Receive receiver1 = new Receive("BO1");
            System.out.println("Receiver "+ receiver1.QUEUE_NAME + " started");
        } catch (Exception et) {
            et.printStackTrace();
        }
        try {
            Receive receiver2 = new Receive("BO2");
            System.out.println("Receiver "+ receiver2.QUEUE_NAME + " started");
        } catch (Exception et) {
            et.printStackTrace();
        }
    }
}
