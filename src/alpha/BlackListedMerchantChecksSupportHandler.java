package alpha;

public class BlackListedMerchantChecksSupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void handleRequest(String request) {
        if (request.equals("BlackListedMerchantChekcs")) {
            System.out.println("BlackListedMerchantSupportHandler: Handling level-3 support request.");
        }
        else if (nextHandler != null) {
            System.out.println("BlackListedMerchantSupportHandle: Passing request to the next handlernextHandler.handleRequest(request)");
        }
    }
}
