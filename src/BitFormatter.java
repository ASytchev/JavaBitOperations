import java.util.Arrays;

/**
 * Created by Alexey Sychev on 21.02.2015.
 */
public class BitFormatter {

    public static String toFormattedBinaryString(byte number) {

        char[] symbols = Integer.toBinaryString(number).toCharArray();
        return makeString(symbols, Byte.SIZE);

    }

    public static String toFormattedBinaryString(short number) {

        char[] symbols = Integer.toBinaryString(number).toCharArray();
        return makeString(symbols, Short.SIZE);

    }

    public static String toFormattedBinaryString(int number) {

        char[] symbols = Integer.toBinaryString(number).toCharArray();
        return makeString(symbols, Integer.SIZE);

    }

    public static String toFormattedBinaryString(long number) {

        char[] symbols = Long.toBinaryString(number).toCharArray();
        return makeString(symbols, Long.SIZE);

    }

    private static String makeString(char[] symbols, int sizeOfType ) {

        StringBuilder sb = new StringBuilder();
        char[] resultArray = new char[sizeOfType];

        int delta = resultArray.length - symbols.length;
        Arrays.fill(resultArray, 0, delta, '0');

        for(int i = 0; i < symbols.length; i++) {
            resultArray[delta + i] = symbols[i];
        }

        for(int i=0; i< resultArray.length; i++) {
            sb.append(resultArray[i]);
            if((i+1) % Byte.SIZE == 0) {
                sb.append(' ');
            }
        }

        return sb.toString();
    }

}
