// 25.05.2019 r, Lab6. Zad3.
// Adrian Szostak, s19777
// Iwona Rymanowska s19330

public class Life extends Insurance {

    private final double lifeInsuranceCost = 500;

    public Life() {
        super("życie");
        setCost();
    }

    @Override
    public double setCost() {
        return monthlyPrice = lifeInsuranceCost;
    }

    @Override
    public void display() {
        System.out.println("Typ ubezpieczenia: " + getTypeOfInsurance() + ", Cena : " + getMonthlyPrice());
    }

}