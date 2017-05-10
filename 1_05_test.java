//ここに自分の番号と名前を書く
class Car {
    private int num;
    private double gas;
    public Car() {
        num = 0; gas = 0.0;
    }
    public Car(int n, double g) {
        num = n; gas = g;
    }
    public void show() {
        System.out.println("(num)" + num + " (gas)" + gas);
    }
}

class Mileage {
    private double dis; //distance（距離）
    private double con; //consumption（消費量）
    public Mileage() {
        dis = 10; con = 1;
    }
    public void setDC(double d, double c) {
        dis = d; con = c;
    }
    public void show() {
        System.out.printf("%fkm/l\n", dis/con);         
    }
}
