// 25.05.2019 r, Lab6. Zad3.
// Adrian Szostak, s19777
// Iwona Rymanowska s19330

public class Health extends Insurance {

    private final double healthInsuranceCost = 340;

    public Health() {
        super("zdrowotne");
        setCost();
    }

    @Override
    public double setCost() {
        return monthlyPrice = healthInsuranceCost;
    }

    @Override
    public void display() {
        System.out.println("Typ ubezpieczenia: " + getTypeOfInsurance() + ", Cena : " + getMonthlyPrice());
    }
}
