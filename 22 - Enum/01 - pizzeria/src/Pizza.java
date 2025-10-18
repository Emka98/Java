enum Pizza {
    
    //Menu
    MARGHERITA("sos pomidorowy + ser"),
    CAPRICIOSA(MARGHERITA.toString() + " + pieczarki"), 
    PROSCIUTTO(MARGHERITA.toString() + " + szynka");

    final String ingredients;

    Pizza(String ingredients){
        this.ingredients = ingredients;
    } 

    @Override
    public String toString(){
        return ingredients; 
    }
}