// Program to demonstrate NullPointerException.
public class NullPointer {
   
    public static void handleException(String text) {
        try {
            text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String str = "hello";
        handleException(str);
    }
}
