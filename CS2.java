import java.util.Scanner;
public class CS2 {
    public static void main(String[] args){
        System.out.println("New Main");
        Scanner sc=new Scanner(new File("src/p1/aa.txt"));
        System.out.println("rEnter name");
        String data=sc.next();
        System.out.println(data);
    }
}
