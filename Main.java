
package module_5;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        ArrayList<Double> temps = new ArrayList<Double>();
        ArrayList<String> days = new ArrayList<String>();

        for (int i = 0; i < 7; i++){
            System.out.println("Enter the Day of the week it is.");
            String day = input.nextLine();
            System.out.println("Enter the temperature in farenheit for this day.");
            double temp = input.nextDouble();
            input.nextLine(); // intakes the leftover new line

            days.add(day);
            temps.add(temp);
        }
        System.out.println("Type 'week' to display the full week's data and average temperature: ");
        String showData = input.nextLine();


        if (showData.toLowerCase().equals("week")){
            double totalTemp = 0;
            for (int i = 0; i < days.size(); i++){
                System.out.println(days.get(i) + ": " + temps.get(i) + "°F");
                totalTemp += temps.get(i);
            }
            double avgTemp = totalTemp / temps.size();
            System.out.println("The average temperature is " + avgTemp + "°F.");
        }

        input.close();

    }

}
