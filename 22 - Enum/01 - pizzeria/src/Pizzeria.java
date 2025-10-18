class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Weelcom in our resturant our menu:");
        for (Pizza pizza : Pizza.values()) {
            System.out.println(pizza.name() + " " +  pizza.ingredients);
        }
    }

}
