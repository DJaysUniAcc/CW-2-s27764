public class OverfillExeption extends RuntimeException {
    public OverfillExeption(String message) {
        super(message);
    }
//    public OverfillExeption() {
//        new OverfillExeption("Load exceeding maximum value. Cannot proceed.");
//    }
}
