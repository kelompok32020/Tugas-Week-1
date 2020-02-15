import java.util.Scanner;

public class geometri  {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("         Deret Geometri");
       
                System.out.print("Masukkan suku pertama (a) : ");
                int a = input.nextInt();

                System.out.print("Masukkan rasio (r)        : ");
                int r = input.nextInt();

                System.out.print("Masukkan banyak suku (n)   : ");
                int n = input.nextInt();

                System.out.println();

                int rn = 1;
                int i = n;
                while (i>0) {
                    rn *= r;
                    i--;
                }
                
                int Un = a * rn / r;
                System.out.println("Nilai suku ke-" + n + " (U" + n + ") adalah    : " + Un);

                int Sn = a * (rn-1) / (r-1);
                System.out.println("Jumlah " + n + " suku pertama (S" + n +") adalah : " + Sn);
                System.out.println();

        }
    } 