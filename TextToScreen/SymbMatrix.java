package TextToScreen;

public class SymbMatrix {
    public static char[][] letterToMatrix(int width, int height, char filler, char symbol){
        //gets template for char
        String template = Template.code(symbol);
        char[] templateArray = template.toCharArray();

        char[][] charArray = new char[height][width];

        char fillEmpty = ' ';
        int k = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (templateArray[k] == '0'){
                    charArray[i][j] = fillEmpty;
                } else {
                    charArray[i][j] = filler;
                }
                k++;
            }
        }
        return charArray;
    }
}
