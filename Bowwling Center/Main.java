import java.util.Date;

public class Main {

    public static void main(String[] args) {

        BowlingAlley p1 = BowlingAlley.Builder.builder()
                .date(new Date(120,9,13))
                .name("Halina")
                .startTime(12)
                .endTime(14)
                .priceStrategy(new StandardPrice())
                .build();
        System.out.println(p1.toString());
        Notifier n1 = new Notifier();
        p1.attach(n1);
        p1.setStartTime(13);
    }
}
