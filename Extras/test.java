public class test {
    public static void main(String[] args) {
        // Unicode code point for Indian Rupee symbol
        int rupeeSymbolCodePoint = 0x20B9;

        // Using String constructor to convert Unicode to String
        String rupeeSymbol = new String(Character.toChars(rupeeSymbolCodePoint));

        System.out.println("Indian Rupee Symbol: " + rupeeSymbol);
    }
}

