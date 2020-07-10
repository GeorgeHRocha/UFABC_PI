import java.util.Scanner;
public class Pisos
{
    public static void main(String[] args)
    {
        int l, c, qtTp1, qtTp2;
        Scanner scan = new Scanner(System.in);
        l = scan.nextInt();
        c = scan.nextInt();
        
        qtTp1 = l * c + ((c - 1) * (l - 1));
        qtTp2 = 2 * ((c - 1) + (l - 1));
        
        System.out.println(qtTp1);
        System.out.println(qtTp2);
    }
}