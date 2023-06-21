public class Face {
    public static void main(String[] args) {
        int i=0;
        for(i=1;i<=8;i++)
        {
            if(i==2||i==8)
            System.out.print("+");
            else if(i==1)
            System.out.print(" ");
            else
            System.out.print("\"");
        }
       
        System.out.println();
       for(i=1;i<=8;i++)
        {
            if(i==2)
            System.out.print("[");
            else if(i==8)
            System.out.print("]");
            else if(i==4||i==6)
            System.out.print("o");
            else
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
       for(i=1;i<=8;i++)
        {
            if(i==2||i==8)
            System.out.print("+");
            else if(i==1)
            System.out.print(" ");
            else
            System.out.print("-");
        }
    }
}
