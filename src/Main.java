
/**
 * Created by  Alexey Sychev on 21.02.2015.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(BitFormatter.toFormattedBinaryString((byte) 1));
        System.out.println(BitFormatter.toFormattedBinaryString((byte) 2));
        System.out.println(BitFormatter.toFormattedBinaryString((byte) Byte.MAX_VALUE));
        System.out.println(BitFormatter.toFormattedBinaryString((short) 1));
        System.out.println(BitFormatter.toFormattedBinaryString((short) 2));
        System.out.println(BitFormatter.toFormattedBinaryString((short) Short.MAX_VALUE));
        System.out.println(BitFormatter.toFormattedBinaryString(1));
        System.out.println(BitFormatter.toFormattedBinaryString(2));
        System.out.println(BitFormatter.toFormattedBinaryString(Integer.MAX_VALUE));
        System.out.println(BitFormatter.toFormattedBinaryString(1L));
        System.out.println(BitFormatter.toFormattedBinaryString(2L));
        System.out.println(BitFormatter.toFormattedBinaryString(Long.MAX_VALUE));


    }

}
