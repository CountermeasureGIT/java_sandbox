import java.io.File;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        //Checked Exception(Compile time exception)

        File file = new File("test");
//        Scanner scanner = new Scanner(file); //FileNotFoundException

//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //Unchecked Exception(Runtime exception)
        int a = 1/0; //ArithmeticException: / by zero

        String str = null;
        System.out.println(str.length()); //NullPointerException
    }
}
