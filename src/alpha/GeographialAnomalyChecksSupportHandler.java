package alpha;

public class GeographialAnomalyChecksSupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void handleRequest(String request) {
        if (request.equals("GeographialAnomalyChekcs")) {
            System.out.println("GeographialAnomalySupportHandler: Handling level-2 support request.");
        }
        else if (nextHandler != null) {
            System.out.println("GeographialAnomalySupportHandle: Passing request to the next handlernextHandler.handleRequest(request)");
        }
    }
}
