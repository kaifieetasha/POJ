public class StandardPrice implements PriceStrategy {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int CalculatePrice(BowlingAlley ba) {
        int hours = ba.getEndTime() - ba.getStartTime();
        if (ba.getDate().getDay() <= 5) {
            price = 50;
        } else {
            price = 60;
        }

        return hours * price;
    }

    @Override
    public String toString() {
        return "StandardPrice{" +
                "price=" + price +
                "/h}";
    }
}

