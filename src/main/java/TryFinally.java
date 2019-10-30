public class TryFinally {
    public static void main(String[] args) {
        try {
            StringBuilder sb = null;
            sb.append("123");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        } finally {
            System.exit(1);
        }

    }
}
