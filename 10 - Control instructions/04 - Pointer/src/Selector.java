class Selector {

    PointController control = new PointController();

    public void selector(int key, Point p){
        switch (key) {
            case 0 -> control.minusX(p);
            case 1 -> control.addX(p);
            case 2 -> control.minusY(p);
            case 3 -> control.addY(p);
        }
    }
}
