public class text4 {
    public static void pramid(int n){
        String o = "";
        for(int i = 1; i <= n; i++){
            o += "*";
            System.out.println(o);
        }
    }
    //*
    //**
    //***
    public static void main(String[] args) {
        pramid(2);
        pramid(3);
        pramid(5);
    }
}
