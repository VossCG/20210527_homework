import java.util.Scanner;

public class Tickets {
    final int oneround = 1000;
    final int allround = (int) (oneround*2*0.9);
    int sheets,sheets_back;
    public void buy_tc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        sheets = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        do {
            sheets_back = scanner.nextInt();
            if(sheets_back>sheets) {System.out.println("Error please try again");
                System.out.println("How many round-trip tickets:");
            }
        }while (sheets<sheets_back) ;
    }
    public int cost_tc(){
        return (sheets_back*allround)+(sheets-sheets_back)*oneround;
    }
    public int sum_tc(){
        return (sheets+sheets_back);
    }
    public void out_information(){
        System.out.println("Total ticket ="+sum_tc());
        System.out.println("Round-trip ="+sheets_back);
        System.out.println("Total cost ="+cost_tc());

    }
}
