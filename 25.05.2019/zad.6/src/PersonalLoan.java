// autorzy: Iwona Rymanowska s19330, Adrian Szostak s19777

public class PersonalLoan extends Loan{
    private final double personal_interest = 2;

    public PersonalLoan()
    {
        super("None", 0, 0);
        super.setInterest(0 + personal_interest);
    }

    public PersonalLoan(String last_name, double amount, int term, double interest)
    {
        super(last_name, amount, term);
        super.setInterest(interest + personal_interest);
    }
}
