public class text2 {
    public static boolean checkEnd(String str1,String str2){
        int j = str1.length()-1; //字串最後一個字
        for (int i = str2.length()-1; i >= 0; i--){
            if(str2.charAt(i) != str1.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkEnd("university","y"));
        System.out.println(checkEnd("university","city"));
        System.out.println(checkEnd("function","ion"));
        System.out.println(checkEnd("GitHub","hub"));
    }
}
