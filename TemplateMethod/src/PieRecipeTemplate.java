import java.util.ArrayList;

public abstract class PieRecipeTemplate {
    
    //Template class

    //Contains all the default implementation steps, cannot be overidden
    //Contains all hooks steps, can be overridden

    private ArrayList<String> ingredients;
    private String pieType;
    protected String pieStatus;
    private int pieSlices;

    public PieRecipeTemplate() {
        this.ingredients = new ArrayList<>();
        this.pieStatus = "prep";
        this.pieType = "na";
        this.pieSlices = 0;
    }

    public void makePie() {}

    public Boolean addIngredients(String i) {
        if (!ingredients.contains(i)) {
            System.out.println("Adding " + i);
            ingredients.add(i);
            return true;
        }
        System.out.println(i + " already added");
        return false;
    }

    public Boolean assembleIngredients() {
        if (!ingredients.contains("puff-pastry")) {
            System.out.println("No Puff Pastry added yet");
            return false;
        }
        System.out.println("Pie is assembled and ready to cook (or seasoned)");
        this.pieStatus = "ready-to-cook";
        return true;
    }

    //Hook Step
    public Boolean seasonPie(String seasoning) {return false;}

    public Boolean cookPie() {
        if (pieStatus.equals("ready-to-cook")) {
            System.out.println("Pie is cooked!");
            this.pieStatus = "cooked";
            return true;
        }
        System.out.println("Pie is not ready to cook");
        return false;
    }

    public Boolean cutPie(int slices) {
        if (pieStatus.equals("cooked")) {
            this.pieStatus = "ready-to-serve";
            this.pieSlices = slices;
            System.out.println("Pie has been cut into " + slices + " slices.");
            return true;
        } else {
            System.out.println("Pie is not ready to serve");
            return false;
        }
    }

    public String checkStatus() {
        return this.pieStatus;
    } 
    public int getSlices() {
        return this.pieSlices;
    }
    public String getPieType() {
        return this.pieType;
    }
    public void setPieType(String type) {
        this.pieType = type;
    }

}
