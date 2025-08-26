public class p1 {
   public static void main(String[] args){
   System.out.println("hi CSd");
   for(int i=0;i<args.length;i++){
      System.out.println(args[i]);
   }
   } 
}
public class Aa {
     public static void main(String[] args){
      System.err.println("Aa data");
      p1.main(new String[]{"hello","A","gjgsjc"});
    }
}

