import java.util.Scanner;

public class ödev {
    public static void main(String[] args) {
        int sayi1;
        Scanner inp = new Scanner(System.in);
        System.out.print("SAYI GİRİNİZ: ");
        sayi1 = inp.nextInt();

        for(int k =0 ; k<=sayi1; k++){

            if( k % 3==0 && k % 4 ==0){
                System.out.println(k);
            }
        }
    }
}
