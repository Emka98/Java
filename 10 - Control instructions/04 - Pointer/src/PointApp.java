class PointApp {
    public static void main(String[] args) {
        
        Point point = new Point(5);
        Selector select = new Selector();

        System.out.printf("X: %d Y: %d\n", point.getX(), point.getY());
        select.selector(1,point);
        System.out.printf("X: %d Y: %d\n", point.getX(), point.getY());
        


    }

}
