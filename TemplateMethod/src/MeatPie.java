public class MeatPie extends PieRecipeTemplate {

    @Override
    public void makePie() {
        addIngredients("puff-pastry");
        addIngredients("minced-beef");
        addIngredients("cheese");
        addIngredients("onions");

        setPieType("Meat Pie");
        assembleIngredients();
        seasonPie("Salt");
        seasonPie("Pepper");
        cookPie();
        cutPie(8);

    }
    @Override
    public Boolean seasonPie(String seasoning) {
        if (pieStatus.equals("ready-to-cook")) {
            System.out.println("Pie is being seasoned with " + seasoning);
            return true;
        } else {
            System.out.println("Pie is NOT ready to be seasoned");
            return false;
        }
    }
}
