package TextToScreen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //character template constants
        int WIDTH = 3, HEIGHT = 5;
        char FILLER = '#';

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text. Use 'abcdefts' letters only: ");
        String text = input.next();
        char[] inputTextArr = text.toCharArray();
        int wordLen = inputTextArr.length;

        char[][][] word = new char[wordLen][HEIGHT][WIDTH];

        //creation of word array
        for (int i = 0; i < wordLen; i++) {

            int code = Chars.code(inputTextArr[i]);
            //System.out.println(code);
            //int to binary
            String binary = Integer.toBinaryString(code);
            // bihary format
            if (binary.length() < (HEIGHT * WIDTH)) {
                binary = "0".repeat(HEIGHT * WIDTH - binary.length()) + binary;
            }

            //System.out.println(binary);

            char[][] symbol = LetterMatrix.letterToMatrix(WIDTH, HEIGHT, FILLER, binary);

            //System.out.println(Arrays.deepToString(symbol));

            for (int j = 0; j < HEIGHT; j++) {
                for (int k = 0; k < WIDTH; k++) {
                    word[i][j][k] = symbol[j][k];
                }
            }
        }
        //System.out.println(Arrays.deepToString(word));
        //print word
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < wordLen ; j++) {
                for (int k = 0; k < WIDTH; k++) {
                    if ((j == wordLen - 1) & (k == WIDTH -1 )){
                        System.out.println(word[j][i][k]);
                    } else if (k == WIDTH - 1){
                        System.out.print(word[j][i][k] + "  ");
                    } else{
                        System.out.print(word[j][i][k]);
                    }
                }
            }
        }
    }
}
