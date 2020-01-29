package TextToScreen;

public class Template {
//    public static int code (char character) {
//        switch (character){
//            case 'a': return 11245;
//            case 'b': return 27566;
//            case 'c': return 31015;
//            case 'd': return 27502;
//            case 'e': return 31207;
//            case 'f': return 31204;
//            case 't': return 29842;
//            case 's': return 31183;
//        }
//        return 0;
//    }
//}
//public class Templates {
    public static String code (char character) {
        switch (character){
            case '-': return "000000111000000";
            case '0': return "111101101101111";
            case '1': return "010110010010111";
            case '2': return "111001111100111";
            case '3': return "111001111001111";
            case '4': return "101101111001001";
            case '5': return "111100111001111";
            case '6': return "111100111101111";
            case '7': return "111001001001001";
            case '8': return "111101111101111";
            case '9': return "111101111001111";
        }
        return "000000000000000";
    }
}
