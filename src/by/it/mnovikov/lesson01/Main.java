package by.it.mnovikov.lesson01;

public class Main {
    public static void main(String[] args) {
        for (short i = -128; i != 128; i++) {
            String binary = Integer.toBinaryString(i);
            String hex = Integer.toHexString(i);
            String octal = Integer.toOctalString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");
            if (hex.length() > 2) hex = hex.substring(hex.length() - 2);
            binary = String.format("%8s", binary).replace(" ", "0");
            if (octal.length() > 3) octal = octal.substring(octal.length() - 3);
            binary = String.format("%8s", binary).replace(" ", "0");
            hex = String.format("%2s", hex).replace(" ", "0");
            octal = String.format("%3s", octal).replace(" ", "0");

            System.out.printf("%8s %4d %2s %3s %n", binary, i, hex, octal);


        }
    }
}