public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;
    public int quantity;

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan, int quantity) {
        this.name = validateName(name);
        this.flowerColor = validateFlowerColor(flowerColor);
        this.country = validateCountry(country);
        this.cost = validateCost(cost);
        this.lifeSpan = validateLifeSpan(lifeSpan);
        this.quantity = validateQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateName(name);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = validateFlowerColor(flowerColor);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = validateCountry(country);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = validateCost(cost);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = validateQuantity(quantity);
    }

    @Override
    public String toString() {
        return "цветок: " + name +
                ", цвет: " + flowerColor +
                ", страна: " + country +
                ", цена за шт. " + cost +
                "руб., срок стояния: " + lifeSpan +
                " дней, количество: " + quantity +
                " шт.";
    }

    public static String validateName(String value) {
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "Информация не указана";
    }

    public static String validateFlowerColor(String value) {
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "белый";
    }

    public static String validateCountry(String value) {
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "Россия";
    }

    public static double validateCost(double value) {
        return value > 0 ? value : 1.00;
    }

    public static int validateLifeSpan(int value) {
        return value > 0 ? value : 3;
    }

    public static int validateQuantity(int value) {
        return value > 0 ? value : 0;
    }

}

