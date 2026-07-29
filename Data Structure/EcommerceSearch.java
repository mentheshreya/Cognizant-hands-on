import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + category;
    }
}

public class EcommerceSearch {

    // Linear Search
    static Product linearSearch(Product[] products, int id) {
        for (Product p : products) {
            if (p.productId == id)
                return p;
        }
        return null;
    }

    // Binary Search
    static Product binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == id)
                return products[mid];

            if (products[mid].productId < id)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Phone", "Electronics"),
                new Product(109, "Shoes", "Fashion"),
                new Product(103, "Watch", "Accessories"),
                new Product(107, "Headphones", "Electronics")
        };

        System.out.println("----- Linear Search -----");

        Product p = linearSearch(products, 103);

        if (p != null)
            System.out.println("Product Found: " + p);
        else
            System.out.println("Product Not Found");

        // Sort before Binary Search
        Arrays.sort(products, Comparator.comparingInt(x -> x.productId));

        System.out.println("\n----- Binary Search -----");

        Product p2 = binarySearch(products, 103);

        if (p2 != null)
            System.out.println("Product Found: " + p2);
        else
            System.out.println("Product Not Found");
    }
}