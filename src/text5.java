public class text5 {
    public static int findLess(int[] inputs, int n){
        int count = 0;
        //for (int i = 0; i < inputs.length; i++)
        for (int i : inputs){
            if (i < n){
                count++;
            }
        }
        return count;
    }
    //小於n的數字有幾個
    public static void main(String[] args) {
        System.out.println(findLess(new int[]{1,2,3}, 2));
        System.out.println(findLess(new int[]{1,2,3,4}, 3));
        System.out.println(findLess(new int[]{1,2,3,4,5}, 0));
    }
}
