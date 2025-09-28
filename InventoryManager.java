import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InventoryManager {

    private Map<String, Integer> prodstk = new HashMap<>();
        
    public void addProductStock(String sku, int quantity) {
        if (prodstk.containsKey(sku)) {
            prodstk.put(sku, prodstk.get(sku) + quantity);
        } else {
            prodstk.put(sku, quantity);
        }
    }

    public int getProductStock(String sku) {
        return prodstk.getOrDefault(sku, 0);
    }

    private Set<String> cates = new HashSet<>();

    public void addCategory(String categoryName) {
        cates.add(categoryName);
    }

    public Set<String> getAvailableCategories() {
        return cates;
    }

    private List<String> salhist = new ArrayList<>();

    public void recordSale(String sku) {
        salhist.add(sku);
    }

    public List<String> getSalesHistory() {
        return salhist;
    }
}

