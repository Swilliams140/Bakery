

public class Bread {



    //private variables
    double flour;
    private double water;
    private double salt;
    private double sugar;
    private double  bakingPowder;
    private double yeast;
    private String breadName;
    private boolean baked;
    private String state;
    private String recipe;
    private String ingredients;



    //no arg constructor
    public Bread(){
        this.flour = 2.4;
        this.water = 7;
        this.salt = 999;
        this.sugar = 100;
        this.bakingPowder = 23;
        this.yeast = 2003;
        this.breadName = "bread name";
        this.state = "not-baked";
    }

    public Bread(String breadName, String ingredients){
        this.breadName = breadName;
        this.ingredients = ingredients;
    }


    // All arg constructor
    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String state, String recipe){
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }


    // Getters
    public double getFlour(){
        return flour;
    }
    public double getWater(){
        return water;
    }
    public double getSalt(){
        return salt;
    }
    public double getSugar(){
        return sugar;
    }
    public double getBakingPowder(){
        return bakingPowder;
    }
    public double getYeast(){
        return yeast;
    }
    public String getBreadName(){
        return breadName;
    }
    public String getState(){
        return state;
    }
    public String getRecipe(){
        return "The recipe of "+breadName+" is: \n";
    }
    public String getIngredients(){
        return ingredients;
    }

    //Setters
    public void setFlour(double flour){
        this.flour = flour;
    }
    public void setWater(double water){
        this.water = water;
    }
    public void setSalt(double salt){
        this.salt = salt;
    }
    public void setSugar(double sugar){
        this.sugar = sugar;
    }
    public void setBakingPowder(double bakingPowder){
        this.bakingPowder = bakingPowder;
    }
    public void setYeast(double yeast){
        this.yeast = yeast;
    }
    public void setBreadName(String breadName){
        this.breadName = breadName;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setRecipe(String recipe){
        this.recipe = recipe;
    }
    public void setIngredients(String ingredients){this.ingredients = ingredients;}
    public void bake(){
        if(state.equals("not baked")){
            state = "baked";
            System.out.println("Can't bake, "+breadName+" is already baked.");
        }else
            System.out.println(breadName+" is already baked.");
    }

    public String toString(){
        return "Ingredients for "+breadName+": \n "+ingredients+" \n Recipe for "+breadName+":\n"+recipe+" \n "+state+" ";
    }







}
