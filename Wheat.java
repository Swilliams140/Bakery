public class Wheat extends Bread{
    private String color;
    private double honey;
    private double oliveOil;

    //no arg constructor
    public Wheat(){
        super();
        setBreadName("Wheat");
        setIngredients("3 cups whole wheat flour\n" +
                "1 cup all-purpose flour (for added texture)\n" +
                "2 tablespoons honey or sugar\n" +
                "1 ½ teaspoons salt\n" +
                "2 ¼ teaspoons active dry yeast (1 packet)\n" +
                "1 ¼ cups warm water (about 110°F or 43°C)\n" +
                "2 tablespoons olive oil (or melted butter)\n" +
                "Optional: 1 tablespoon vital wheat gluten (for better rise)");
        this.color = "brown";
        this.honey = 20;
        this.oliveOil = 30;
    }

    public Wheat(String color,double honey, double oliveOil){
        super();
        this.color = color;
        this.honey = honey;
        this.oliveOil = oliveOil;
    }

    public String getColor(){
        return color;
    }
    public double getHoney(){
        return honey;
    }
    public double getOliveOil(){
        return oliveOil;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setHoney(double honey){
        this.honey = honey;
    }
    public void setOliveOil(double oliveOil){
        this.oliveOil = oliveOil;
    }


}
