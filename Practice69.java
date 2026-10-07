public class Practice69 {
    public static void main(String[] args) {
        int decimal = 13;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(decimal + " in binary: " + binary);

        String binaryInput = "1101";
        int backToDecimal = Integer.parseInt(binaryInput, 2);
        System.out.println(binaryInput + " in decimal: " + backToDecimal);
    }
}