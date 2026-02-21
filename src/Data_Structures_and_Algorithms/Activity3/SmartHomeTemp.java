package Data_Structures_and_Algorithms.Activity3;

public class SmartHomeTemp {
    static void main(String[] args) {
        // Simulated temperature readings from smart home sensors
        double[] temperatures = {21.5, 23.0, 19.8, 22.2, 24.5};
        double sum = 0;

        // Sum temperatures and warn if high
        for (double temp : temperatures) {
            sum += temp;
            if (temp > 23.0) {
                IO.println("Warning: High temperature detected: " + temp);
            }
        }

        // Compute and display average
        double average = sum / temperatures.length;
        IO.println("Average temperature: " + average);
    }
}
