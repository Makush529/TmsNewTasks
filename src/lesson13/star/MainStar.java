package lesson13.star;

public class MainStar {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.exit(0);
        }catch(Exception exception){
            System.out.println("catch");}
        finally{
            System.out.println("finally");

        }
    }
}
