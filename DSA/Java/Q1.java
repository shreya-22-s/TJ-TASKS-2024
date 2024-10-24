public class Q1 {
    public static void generatePascalTriangle(int n) {
        //write your code here
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.println(" ");
            }
            int c=1;
            for(int k=1;k<=i;k++){
                System.out.println(c+ " ");
                c=c*(i-k)/k;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generatePascalTriangle(n);
    }
}
