package ex26;

public class PaymentCalculator {

    public static int calculateMonthsUntilPaidOff(double b, double i, double p) {

        i = (i/365) * .01;
        double answer = Math.pow(1 + i, 30);
        answer = 1 - answer;
        answer = answer * (b / p) + 1;
        answer = Math.log10(answer);
        answer = answer / Math.log10(1 + i);
        answer = answer / 30;
        answer *= -1;
        answer = Math.ceil(answer);

        return (int) answer;
    }
}
