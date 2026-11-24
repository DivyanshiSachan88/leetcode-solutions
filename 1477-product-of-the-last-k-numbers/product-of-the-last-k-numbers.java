import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {
    private final List<Integer> prefixProducts;

    public ProductOfNumbers() {
        prefixProducts = new ArrayList<>();
        prefixProducts.add(1); // Sentinel for division
    }

    public void add(int num) {
        if (num == 0) {
            prefixProducts.clear();
            prefixProducts.add(1);
        } else {
            int lastProduct = prefixProducts.get(prefixProducts.size() - 1);
            prefixProducts.add(lastProduct * num);
        }
    }

    public int getProduct(int k) {
        int size = prefixProducts.size();

        if (k >= size) {
            return 0; // A zero is among the last k numbers
        }

        return prefixProducts.get(size - 1)
             / prefixProducts.get(size - 1 - k);
    }
}