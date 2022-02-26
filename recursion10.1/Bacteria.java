import java.util.Scanner;

public class Bacteria
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours will the bacteria breed? ");
        int hours = input.nextInt();
        int bacteria = colonySize(hours);
        System.out.println("After " + hours + " hours, there will be " + bacteria);
    }
    
    public static int colonySize(int hour)
    {
        if (hour == 0) {
            return 7;
        } else {
            return colonySize(hour-1) + colonySize(hour-1)*4;
        }
    }
}
