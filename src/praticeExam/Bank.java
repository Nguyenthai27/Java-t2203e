package praticeExam;

public class Bank {
    public double banlance;
    public double rate;
    public Bank(){

    }

    public Bank(double banlance, double rate) {
        this.banlance = banlance;
        this.rate = rate;
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public void calculateInterest(){
        double i = 0;
    }
}
