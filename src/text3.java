public class text3 {
    public static boolean findDuplicate(int[] inputs){
        for(int i = 0; i<inputs.length; i++){
            for (int j = i+1; j < inputs.length; j++){
                if (inputs[i] == inputs[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //有沒又重複的數字
    public static void main(String[] args) {
        System.out.println(findDuplicate(new  int[]{1,3,5,7,9,3}));
        System.out.println(findDuplicate(new  int[]{}));
        System.out.println(findDuplicate(new  int[]{3,4,5,6,7,10,0}));
        System.out.println(findDuplicate(new  int[]{3,4,5,10,10,10}));
    }
}
