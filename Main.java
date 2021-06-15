import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "You Only Live Once. But if You do it right. once is Enough";
        char ch;
        int uppercase=0,lowercase=0;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            int asciivalue = (int)ch;
            if(asciivalue >=65 && asciivalue <=90){
                uppercase++;
            }
            else if(asciivalue >=97 && asciivalue <=122){
                lowercase++;
            }
        }
        System.out.println("No of uppercase letter : " + uppercase);

        //In hoa toan bo chu dau
        char[] charArray = str.toCharArray();
        boolean foundSpace = true;
        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        str = String.valueOf(charArray);
        System.out.println("Viết hoa tất cả chữ cái đầu: " + str);


        //In hoa chu dau tien cua chuoi
        String firstLetter = str.substring(0, 1);
        String remainingLetters = str.substring(1, str.length());
        firstLetter = firstLetter.toUpperCase();
        remainingLetters = remainingLetters.toLowerCase();
        str = firstLetter + remainingLetters;
        System.out.println("Viết hoa chữ đầu tiên: " + str);
    }
}