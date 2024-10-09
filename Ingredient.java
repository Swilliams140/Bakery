public class Ingredient {
    private String breadName;
    private double quantity;
    private String measurement;
    private String ingredient;

    public Ingredient(double quantity, String measurement, String ingredient, String breadName){
        this.breadName = breadName;
        this.quantity = quantity;
        this.measurement = measurement;
        this.ingredient = ingredient;
    }

    public double getQuantity(){
        return quantity;
    }
    public String getMeasurement(){
        return measurement;
    }
    public String getIngredient(){
        return ingredient;
    }
    public String getBreadName(){
        return breadName;
    }

    public void setQuantity(double quantity){
        this.quantity = quantity;
    }
    public void setMeasurement(String measurement){
        this.measurement = measurement;
    }
    public void setIngredients(String ingredient){
        this.ingredient = ingredient;
    }
    public void setBreadName(String breadName){
        this.breadName = breadName;
    }


    public String toString(){
        return "Quantity: " + quantity + ", Measurement: " + measurement + ", Ingredient: " + ingredient + "\n";
    }
}
