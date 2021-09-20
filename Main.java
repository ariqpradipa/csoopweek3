import java.util.Scanner;
public class Main
{
    public static void Main(String [] args)
    {  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama jamur 1");
        String nama1 = scanner.nextLine();
        System.out.println("Masukkan nama spesies jamur 1");
        String spesies1 = scanner.nextLine();
//       System.out.println("Masukkan nama jamur 2");
//       String nama2 = scanner.nextLine();
//      System.out.println("Masukkan nama spesies jamur 2");
//        String spesies2 = scanner.nextLine();
        Fungi jamur1 = new Fungi();
//        Fungi jamur2 = new Fungi(nama2, spesies2);
        System.out.println("click 1 to eat and other to be eaten for jamur 1");
        int response1 = scanner.nextInt();
        switch (response1){
            case 1: jamur1.eat();
            break;
            default: jamur1.eaten();
            break;
        }
//        System.out.println("click 1 to eat and other to be eaten for jamur 2");        
//        int response2 = scanner.nextInt();
//       switch (response2){
//            case 1: jamur2.eat();
//            break;
//            default: jamur2.eaten();
//            break;
//        }

        
        
    }
}
