import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOToolkit {

    static BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

    public static int AskInt() {
        String num;

        while (true) {
            try {

                num = Integer.parseInt(kb.readLine());
                break;

            } catch (Exception e) {

                System.out.println("You must insert an integer");
            }
        }
        return num;
    }

    public static Boolean AskBoolean() {
        String input;

        while (true) {

            input = kb.readLine();

            if (input.trim().toLowerCase().equals("true")) {
                return true;
            }

            if (input.trim().toLowerCase().equals("false")) {
                return false;
            }

            System.out.println("You must insert either true or false");
        }
    }
}