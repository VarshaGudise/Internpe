public class AmericanFlag {
    public static void main(String[] args) {
int i,j;
for(i=1;i<11;i++)
  {
    for(j=1;j<=11;j++)
    {
                if(i%2==0)
                {
                    if(j%2==0)
                    System.out.print("*");
                   else
                    System.out.print(" ");
                }
             else
             {
                 if(j%2!=0)
                 System.out.print("*");
                 else
                 System.out.print(" ");
             }
             
    }
    for(j=12;j<=46;j++)
             {
                 System.out.print("=");
             }
    System.out.println();
}
            for(i=12;i<=18;i++)
            {
               for(j=1;j<=46;j++)
               {
               System.out.print("=");
              }
              System.out.println();
                 }
}
    

}
