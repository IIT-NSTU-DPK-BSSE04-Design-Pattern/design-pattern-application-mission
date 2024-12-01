package alpha;

public class BasicChecksSupportHandler implements SupportHandler {
    private SupportHandler nextHandler;
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void handleRequest(String request) {
        if (request.equals("BasicChekcs")) {
            System.out.println("BasicChekcsSupportHandler: Handling level-1 support request.");
        }
        else if (nextHandler != null) {
            System.out.println("BasicChekcsSupportHandle: Passing request to the next handlernextHandler.handleRequest(request)");
        }
    }
}
