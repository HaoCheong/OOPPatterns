public abstract class Handler {
    
    private Handler next;

    public Handler linkWith(Handler next) {
        this.next = next;
        return next;
    }

    public abstract Boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
