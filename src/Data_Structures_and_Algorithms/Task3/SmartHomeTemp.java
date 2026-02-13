package Data_Structures_and_Algorithms.Task3;

public class SmartHomeTemp {
    static void main(String[] args) {
        // Simulated temperature readings
        double[] temperatures = {21.5, 23.0, 19.8, 22.2, 24.5};
        double sum = 0;

        // Sum temperatures and warn if high
        for (double temp : temperatures) {
            sum += temp;
            if (temp > 23.0) {
                System.out.println("Warning: High temperature detected: " + temp);
            }
        }

        // Compute and display average
        double average = sum / temperatures.length;
        System.out.println("Average temperature: " + average);
    }
}
