package TextToScreen;

import java.util.Arrays;

public class LetterMatrix {
    public static char[][] letterToMatrix(int width, int height, char filler, String binary){
        char[][] charArray = new char[height][width];
        char[] binArray = binary.toCharArray();

        char fill = ' ';
        int k = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (binArray[k] == '0'){
                    fill = ' ';
                }   else {
                    fill = filler;
                }
                charArray[i][j] = fill;
                k++;
            }
        }
        return charArray;
    }
}
