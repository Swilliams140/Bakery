public class Sourdough extends Bread{
    private double ripeSourDough;

    public Sourdough(){
        super();
        setBreadName("Sourdough");
        setIngredients("5.00 cups of flour\n" +
                "1.50 cups of water\n" +
                "2.50 tsps of salt\n" +
                "1.00 tsp of yeast\n" +
                "1.00 cup of ripe sourdough starter\n");
        setRecipe("1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n" +
                "2. Make the dough\n" +
                "3. Bulk Rise\n" +
                "4. Stretch and fold the dough\n" +
                "5. Cut and shape the dough\n" +
                "6. Second rise\n" +
                "6. Preheat the oven to 450°F towards the tail end of the second rise.\n" +
                "7. Spray the loaf with luke warm water.\n" +
                "8. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n" +
                "9. Remove the bread from the oven.\n" +
                "10.Let the bread cool until good to eat.");
        this.ripeSourDough = 0;

    }
    public Sourdough(double ripeSourDough, double flour){
        this.ripeSourDough = ripeSourDough;
        this.flour = flour;

    }

    public double getRipeSourDoughrDough(){
        return ripeSourDough;
    }

    public void setRipeSourDough(double ripeSourDough) {
        this.ripeSourDough = ripeSourDough;

    }




}