package ShoppingMall;

public class clothes implements Shopping {   // ✅ Class names should start with uppercase

    @Override
    public void purchase() {
        System.out.println("Clothes purchased successfully!");
    }
}
