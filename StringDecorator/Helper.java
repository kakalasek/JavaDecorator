package StringDecorator;

public class Helper {
    public static boolean containsUpper(String str){
        char splitString[] = str.toCharArray();
        for(int i = 0; i < splitString.length; i++){
            if(Character.isUpperCase(splitString[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean containsLower(String str){
        char splitString[] = str.toCharArray();
        for(int i = 0; i < splitString.length; i++){
            if(Character.isLowerCase(splitString[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean isFirstCapital(String str){
        if(Character.isUpperCase(str.toCharArray()[0])) {
            return true;
        }
        return false;
    }
}
