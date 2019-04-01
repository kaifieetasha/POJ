//Iwona Rymanowska s19330 grupa 22c
//Jakub Janduła s6363 grupa 22c

public class Human{
    private int wiek ;
    private int waga;
    private int wzrost;
    private String imie ;
    private char plec;
    private int indeks;
    private int stopa;

    public int getWiek() {
        return wiek;
    }
    public int getWaga() {
        return waga;
    }
    public int getWzrost() {
        return wzrost;
    }
    public String getImie() {
        return imie;
    }
    public int getPlec() {
        return plec;
    }
    public int getindeks() {
        return indeks;
    }
    public int getStopa() {
        return stopa;
    }

    public void setWiek(int Nwiek){
        this.wiek = Nwiek;
    }
    public void setWaga(int Nwaga){
        this.waga = Nwaga;
    }
    public void setWzrost(int Nwzrost){
        this.wzrost = Nwzrost;
    }
    public void setImie(String Nimie){
        this.imie = Nimie;
    }
    public void setPlec(char Nplec){
        this.plec = Nplec;
    }
    public void setIndeks(int Nindeks){
        this.indeks = Nindeks;
    }
    public void setStopa(int Nstopa){
        this.stopa = Nstopa;
    }


    // arguments are passed using the text field below this editor
    public static void main(String[] args)
    {
        Human Jakub = new Human();
        Jakub.setImie("Jakub");
        Jakub.setWiek (32);
        Jakub.setWaga (68);
        Jakub.setWzrost (180);
        Jakub.setPlec ('M');
        Jakub.setStopa (46);
        Jakub.setIndeks (6343);

        Human Iwona = new Human();
        Iwona.setImie("Iwona");
        Iwona.setWiek(25);
        Iwona.setWaga(50);
        Iwona.setWzrost(174);
        Iwona.setPlec('K');
        Iwona.setStopa(36);
        Iwona.setIndeks (19330);

    }
}

