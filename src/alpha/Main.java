package alpha;

public class Main {
    public static void main(String[] args) {

        SupportHandler Level1 = new BasicChecksSupportHandler();
        SupportHandler Level2 = new GeographialAnomalyChecksSupportHandler();
        SupportHandler Level3 = new BlackListedMerchantChecksSupportHandler();
        SupportHandler Level4 = new HighRisktransactionChecksSupportHandler();

        Level1.setNextHandler(Level2);
        Level2.setNextHandler(Level3);
        Level3.setNextHandler(Level4);

        System.out.println("Client sends a Level1 request:");
        Level1.handleRequest("level1");
        System.out.println("\nClient sends a Level2 request:");
        Level1.handleRequest("Level2");
        System.out.println("\nClient sends a Level3 request:");
        Level1.handleRequest("Level3");
        System.out.println("\nClient sends a Level4 request:");
        Level1.handleRequest("Level4");
        System.out.println("\nClient sends a unknown request:");
        Level1.handleRequest("Unknown");
    }
}
