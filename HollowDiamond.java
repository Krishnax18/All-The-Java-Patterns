public class HollowDiamond {
    public static void main(String[] args)
{
        int k=1,c=5,v=2;
        for(int i=1;i<=9;i++)
    {
    if(i<=5)
    {
        for(int s=5;s>=i;s--)
        {
            System.out.print(" ");
        }
        if(i==1)
        {
        System.out.print("*");
        }
        else
        {
         System.out.print("*");
         for(int j=1;j<=k;j++)
         {
            System.out.print(" ");
         }
         System.out.print("*");
         k=k+2;
        }
    }
    else    {
        
            if(i==9)
            { 
                for(int n=1;n<=5;n++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else
            {
                for(int l=1;l<=v;l++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int m=1;m<=c;m++)
                { 
                 System.out.print(" ");   
                }              
                System.out.print("*");
                c=c-2;
                v=v+1;
            }
        }
        System.out.println();
    }
}

}
