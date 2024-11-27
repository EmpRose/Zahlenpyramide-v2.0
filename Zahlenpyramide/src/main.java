import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int level_count = 0;
        StringBuilder Zahlenkette = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print a positive Number to build a pyramid");
        String level = scanner.next();
        String placeholder = " ";



        try {
            level_count = Integer.parseInt(level);
            if(level_count > 0){
            for (int i = 0; i < level_count; i++) {
                Zahlenkette.append(i + 1);
                for(int j = level_count; j >= i; j--){
                    System.out.print(placeholder);

                }
                System.out.println(Zahlenkette.toString()+Zahlenkette.reverse());
                Zahlenkette.reverse();

            }
            }else{
                System.out.println("Input was zero or lower.");
            }
        }catch(NumberFormatException e){
            System.out.println("Input was not a number");
        }
    }
}
