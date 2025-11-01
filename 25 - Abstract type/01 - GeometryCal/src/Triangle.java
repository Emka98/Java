class Triangle implements Shape{

    private double h;
    private double a;

    public Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }

    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a*h/2;
    }

    @Override
    public double calculatePerimeter(){
        return 3*a;
    }
}
