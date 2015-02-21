import java.util.Arrays;

/**
 * Created by Alexey Sychev on 21.02.2015.
 */
public class BitFormatter {
    static final int INT_LENGTH = 32;
    static final int LONG_LENGTH = 64;

    public static String toFormatedBinaryString(int number) {
        StringBuilder sb = new StringBuilder();
        char[] symbols = Integer.toBinaryString(number).toCharArray();

        char[] resultArray = new char[INT_LENGTH];
        int delta = resultArray.length - symbols.length;
        Arrays.fill(resultArray, 0, delta, '0');
        for(int i = 0; i < symbols.length; i++) {
            resultArray[(resultArray.length-1) - i] = symbols[(symbols.length-1) -i];
        }

        System.out.println(number + " ->");
        for(int i=0; i< resultArray.length; i++) {
            sb.append(resultArray[i]);
            if((i+1) % 8 == 0) {
                sb.append(' ');
            }
        }
        return sb.toString();

    }

    public static String toFormatedBinaryString(long number) {

        StringBuilder sb = new StringBuilder();
        char[] symbols = Long.toBinaryString(number).toCharArray();

        char[] resultArray = new char[LONG_LENGTH];
        int delta = resultArray.length - symbols.length;
        Arrays.fill(resultArray, 0, delta, '0');
        for(int i = 0; i < symbols.length; i++) {
            resultArray[(resultArray.length-1) - i] = symbols[(symbols.length-1) -i];
        }

        System.out.println(number + " ->");
        for(int i=0; i< resultArray.length; i++) {
            sb.append(resultArray[i]);
            if((i+1) % 8 == 0) {
                sb.append(' ');
            }
        }
        return sb.toString();

    }
}
