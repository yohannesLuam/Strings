import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concatenating {
    public static void main(String[] args) throws IOException {
        String str1, str2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter a string value.");
        str1 = (br.readLine());
        System.out.println("Please enter another string value.");
        str2 = (br.readLine());
        str1.concat(str2);
        str2.concat(str1);
        System.out.println(str1 + " " + str2);
        System.out.println(str1.compareTo(str2));
    }
}
