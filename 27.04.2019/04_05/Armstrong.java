public class Armstrong {
    private int number;
    private boolean isArmstrong;

    public Armstrong (int _number) {
        number = _number;
    }

    public int Power (int digit) {
        int power = digit;
        for (int i = 1; i < 3; i++) power *= digit;
        return power;
    }

    public boolean Armstrong () {
        int ones = number%10;
        int tens = number/10%10;
        int hundreds = number/100%10;

        int suma = Power(ones)+Power(tens)+Power(hundreds);

        if (suma == number) isArmstrong = true;
        return isArmstrong;
    }
}

