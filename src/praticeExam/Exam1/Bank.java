package praticeExam.Exam1;

public class Bank {
    public double balance;
    public double rate;
    public Bank(){

    }

    public Bank(double banlance, double rate) {
        this.balance = banlance;
        this.rate = rate;
    }

    public double getBanlance() {
        return balance;
    }

    public void setBanlance(double banlance) {
        this.balance = banlance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest(){
        return balance * ( rate / 1200);
    }

}
