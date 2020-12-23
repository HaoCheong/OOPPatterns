public class ChocolatePie extends PieRecipeTemplate{
    @Override
    public void makePie() {
        addIngredients("puff-pastry");
        addIngredients("sugar");
        addIngredients("spice");
        addIngredients("everything-nice");
        addIngredients("chemical-x");
		setPieType("chocolate");
        assembleIngredients();
        cookPie();
        cutPie(8);
    }
}
