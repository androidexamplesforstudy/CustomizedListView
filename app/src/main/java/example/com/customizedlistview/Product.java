package example.com.customizedlistview;

/**
 * Created by BloodyFire on 29.12.2016.
 */

public class Product {

    private int protein;
    private int carbo;
    private int fat;
    private int calories;

    public Product(int protein, int carbo, int fat) {
        this.protein = protein;
        this.carbo = carbo;
        this.fat = fat;
        this.calories = (protein*4) + (carbo*4) + (fat*9);
    }

    public int getProtein() {
        return protein;
    }

    public int getCarbo() {
        return carbo;
    }

    public int getFat() {
        return fat;
    }

    public int getCalories() {
        return calories;
    }
}
