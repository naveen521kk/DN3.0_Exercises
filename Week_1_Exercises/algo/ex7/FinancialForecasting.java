package ex7;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double predictFutureValue(double presentValue, double growthRate, int periods) {

        if (periods == 0) {
            return presentValue;
        }

        return predictFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial value
        double growthRate = 0.05; // 5% growth rate per period
        int periods = 10; // Number of periods

        double futureValue = predictFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }
}
