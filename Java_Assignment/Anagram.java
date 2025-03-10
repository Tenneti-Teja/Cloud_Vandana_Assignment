import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2: ");
        String str2 = sc.nextLine();
        sc.close();
        char []strArr1 = str1.toCharArray();
        char []strArr2 = str2.toCharArray();
        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        if (strArr1.length==strArr2.length) {
            if (Arrays.equals(strArr2, strArr2)) {
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
        else{
            System.out.println(false);
        }
    }
}

