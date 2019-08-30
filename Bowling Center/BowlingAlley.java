import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BowlingAlley implements Observable{
    private String name;
    private int startTime;
    private int endTime;
    private Date date;
    private PriceStrategy priceStrategy;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }


    public static final class Builder {
        private String name;
        private int startTime;
        private int endTime;
        private Date date;
        private PriceStrategy priceStrategy;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder startTime(int startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder endTime(int endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }
        public Builder priceStrategy(PriceStrategy priceStrategy) {
            this.priceStrategy = priceStrategy;
            return this;
        }

        public static Builder builder() {
            return new Builder();
        }

        public BowlingAlley build() {
            if (name.isEmpty()) {
                throw new IllegalStateException("Name cannot be empty");
            }
            BowlingAlley BowlingAlley = new BowlingAlley();
            BowlingAlley.name = this.name;
            BowlingAlley.startTime = this.startTime;
            BowlingAlley.endTime = this.endTime;
            BowlingAlley.date = this.date;
            BowlingAlley.priceStrategy = this.priceStrategy;
            BowlingAlley.calculatePrice();
            return BowlingAlley;
        }

    }
    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
        notifyObservers(this.toString());
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
        notifyObservers(this.toString());
    }

    public int calculatePrice(){
        return priceStrategy.CalculatePrice(this);
    }

    @Override
    public String toString() {
        return "BowlingAlley{" +
                "name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", date=" + date +
                ", priceStrategy=" + priceStrategy +
                '}';
    }
}
