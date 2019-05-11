
public class Staff extends Person {
    private String school;
    private double pay;

    public Staff (String _school, double _pay, String _name, String _address){
        super(_name, _address);
        school = _school;
        pay = _pay;

    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString(){
        return "Staff[Person[name= "+getName()+", address= "+getAddress()+"], school= "+school+", pay= "+pay+".]";
    }
}
