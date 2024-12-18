public class DiamondPattern {
    public static void DiamondPatter(int n) {
        for(int i=1; i<=n; i++) {
            // spaces
            for(int j=1; j<=n-i-1; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=(2*i-1); j++) {
                if(n%2 != 0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            // spaces
            for(int j=1; j<=n-i-1; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=(2*i)-1; j++) {
                if(n%2 != 0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DiamondPatter(5);
    }
    
}