// autorzy: Iwona Rymanowska s19330, Adrian Szostak s19777

public abstract class Loan implements LoanConstants {
        private int ID;
        private String last_name;
        private double amount;
        private double interest_rate;
        private int term;

        private static int id_counter = 1;

        public Loan(int ID, String last_name, double amount, int term) {
            this.last_name = last_name;

            if(amount > LoanConstants.MAX_LOAN_SIZE || amount < 0) {
                this.amount = 0;
            } else {
                this.amount = amount;
                this.ID = id_counter++;
            }

            if(term == LoanConstants.MEDIUM_TERM || term == LoanConstants.LONG_TERM) {
                this.term = term;
            } else {
                this.term = LoanConstants.SHORT_TERM;
            }
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getInterest_rate() {
            return interest_rate;
        }

        public void setInterest_rate(double interest_rate) {
            this.interest_rate = interest_rate;
        }

        public int getTerm() {
            return term;
        }

        public void setTerm(int term) {
            this.term = term;
        }

        public static int getId_counter() {
            return id_counter;
        }

        public static void setId_counter(int id_counter) {
            Loan.id_counter = id_counter;
        }

        public String toString() {
            return "Loan ID: " + getID() +
                    "\nLast name: " + getLast_name() +
                    "\namount: " + getAmount() +
                    "\ninterest rate: " + getInterest_rate() +
                    "\nterm: " + getTerm();
        }
}
