import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class InventoryManager {

    public void addProductStock(String sku, int quantity) {

        ArrayList<String> stkUnt = new ArrayList<>();

        stkUnt.add("Accesories");
        stkUnt.add("Clothes");
        stkUnt.add("Jewelleries");
        
        ArrayList<int> stkQtt = new ArrayList<>();

        stkQtt.add(120);
        stkQtt.add(175);
        stkQtt.add(188);

    }

    public int getProductStock(String sku) {
        
        return stkUnt;
        return stkQtt;
    }

    public void addCategory(String categoryName1, String categoryName2, String categoryName3) {

        ArrayList<String> cats = new ArrayList<>();

        cats.add(categoryName1);
        cats.add(categoryName2);
        cats.add(categoryName3);
        
    }

    public Set<String> getAvailableCategories() {

        ArrayList<String> cats = new ArrayList<>();

        cats.add("Women");
        cats.add("Men");
        cats.add("Children");

        return null;
    }

    public void recordSale(String sku) {
        
    }

    public List<String> getSalesHistory() {
        return null;
    }
}
