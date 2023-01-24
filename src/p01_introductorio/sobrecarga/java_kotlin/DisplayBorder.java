package p01_introductorio.sobrecarga.java_kotlin;

final class DisplayBorder {

    private DisplayBorder() {}

    static final char DEFAULT_CHARACTER = '=';
    static final int DEFAULT_LENGHT = 15;

    static void displayBorder(char character, int length) {
        for (int i = 0; i<length; i++) {
            System.out.print(character);
        }
        System.out.println();
    }

    static void displayBorder(int length) {
        displayBorder(DEFAULT_CHARACTER, length);
    }

    static void displayBorder(char character) {
        displayBorder(character, DEFAULT_LENGHT);
    }

    static void displayBorder() {
        displayBorder(DEFAULT_CHARACTER, DEFAULT_LENGHT);
    }


}

class Main {
    public static void main(String[] args) {

        DisplayBorder.displayBorder();
        DisplayBorder.displayBorder('*');
        DisplayBorder.displayBorder(5);
        DisplayBorder.displayBorder('*',20);

    }
}