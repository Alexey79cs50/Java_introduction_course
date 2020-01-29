package TextToScreen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //character template constants
        int WIDTH = 3, HEIGHT = 5;
        char FILLER = '#';

        //variables
        int userNumber = 0;
        boolean pass;

        //scanner initialisation
        Scanner input = new Scanner(System.in);
        //value requested and validated
        do {
            System.out.print("Enter the 5 symbols number: ");

            if(input.hasNextInt()){
                userNumber = input.nextInt();
                pass = userNumber > -10000 && userNumber < 100000;
            } else {
                pass = false;
                input.next();
            }
        } while (!pass);

        //convert int to str, make char array
        String text = Integer.toString(userNumber);
        char[] inputTextArr = text.toCharArray();
        int wordLen = inputTextArr.length;

        //main array initialisation
        char[][][] word = new char[wordLen][HEIGHT][WIDTH];

        //creation of word array
        for (int i = 0; i < wordLen; i++) {
            //gets letter template array
            char[][] symbol = SymbMatrix.letterToMatrix(WIDTH, HEIGHT, FILLER, inputTextArr[i]);
            //fill in word array
            for (int j = 0; j < HEIGHT; j++) {
                for (int k = 0; k < WIDTH; k++) {
                    word[i][j][k] = symbol[j][k];
                }
            }
        }

        //print word array
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