public class Q1 {
    public static void generatePascalTriangle(int n) {
         for(int i=1;i<=n;i++){
             for(int j=0;j<=n-i;j++){
                 System.out.println(" ");
             }
             int c=1;
             for(int j=1;j<=i;j++){
                 System.out.println(c+ " ");
                 c=c*(i-j)/j;
             }
             System.out.println();
         }
    }

    public static void main(String[] args) {
        int n = 5;
        generatePascalTriangle(n);
    }
}
