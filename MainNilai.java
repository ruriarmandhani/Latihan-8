package mainnilai;
import java.util.Scanner;
public class MainNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        double a = input.nextDouble();
        TipeAngka ta = new TipeAngka();
        if(a !=(int)a){
            ta.methodD1();
        }
        else{
            ta.methodI1();
        }
    }
}