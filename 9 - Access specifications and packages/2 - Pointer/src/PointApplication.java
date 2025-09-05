class PointApplication {
    public static void main(String[] args) {
        
        Point pon1 = new Point(5);
        PointController control = new PointController(); 
        
        System.out.println(pon1.getX());
        control.addX(pon1);
        System.out.println(pon1.getX());
    }
}
