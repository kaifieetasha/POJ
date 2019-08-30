public class HappyHoursPrice implements PriceStrategy {
    private int price = 40;

    public int getPrice() {
        return price;
    }

    @Override
    public int CalculatePrice(BowlingAlley ba) {

        int hours = ba.getEndTime() - ba.getStartTime();
        return  hours * price;
    }

    @Override
    public String toString() {
        return "HappyHoursPrice{" +
                "price=" + price +
                '}';
    }
}
