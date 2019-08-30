public class Notifier implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Zmieniles rezerwacje, nowa rezerwacja:\n"+status);
    }
}
