public class Pastry extends Bread{
    private double cream;

    public Pastry(double cream){
        super();
        setBreadName("Pastry");
        this.cream = cream;
    }

    public double getCream(){
        return cream;
    }
    public void setCream(double cream){
        this.cream = cream;
    }

    //public String getIngredients(){

        //return null;
    //}

    public String toString(){
        return "Pastry: " + getBreadName() + ", Cream: " + getCream();
    }
}
