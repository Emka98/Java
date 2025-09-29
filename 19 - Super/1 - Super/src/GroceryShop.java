public class GroceryShop {
    public static void main(String[] args) throws Exception {
        
        Fruit fruit1 = new Fruit("jabco", 320);
        System.out.println(fruit1.getInfo());

        Apple apple1 = new Apple("Jabco", 222, "Gold");
        System.out.println(apple1.getInfo());
    }
}
