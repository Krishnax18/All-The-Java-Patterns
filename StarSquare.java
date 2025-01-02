public class StarSquare {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            if (i==1 || i==5) {
                for(int j=1;j<=5;j++)
                {
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("*");
                for(int c=1;c<=7;c++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
