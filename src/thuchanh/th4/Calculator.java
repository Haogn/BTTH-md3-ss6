package thuchanh.th4;

public class Calculator {
    double a ;
    double b ;
    public Calculator() {

    }
    public Calculator(double a , double b) {
        this.a= a ;
        this.b= b ;
    }

    // cac phuong thuc get/set
    public double getA() {
        return a ;
    }
    public void setA(double a ) {
        this.a = a ;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b ;
    }

    // cac phuong thuc tinh toan
    public double multi() {
        return a * b ;
    }
    public double div() {
        return a / b ;
    }
    public double sum() {
        return a  +b ;
    }
    public double sub() {
        return a - b ;
    }
}
