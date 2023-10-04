import java.util.Scanner;
public class pratik {

    public static void main(String[] args) {
        int  sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("SAYI GİRİNİZ : ");
        sayi = inp.nextInt();
        
        for( int i =0; i<=sayi; i++){
            if( i % 2 ==0){
                System.out.println(i);
            }
        }
    }
}