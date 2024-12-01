package alpha;

public class HighRisktransactionChecksSupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void handleRequest(String request) {
        if (request.equals("HighRisktransactionChekcs")) {
            System.out.println("HighRisktransactionSupportHandler: Handling level-4 support request.");
        }
        else if (nextHandler != null) {
            System.out.println("HighRisktransactionSupportHandle: Passing request to the next handlernextHandler.handleRequest(request)");
        }
    }
}
