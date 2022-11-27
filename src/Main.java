public class Main {
    public static void main(String[] args) {

        Flower[] bouquet = new Flower[]{
                new Flower("Роза обыкновенная","","Голандия",35.59, 0, 1),
                new Flower("Хризантема", "", "",15.00,5, 1),
                new Flower("Пион","","Англия", 69.90, 1, 1),
                new Flower("Гипсофила",null,"Турция", 19.50,10, 1)
        };
// Блок составления букетов:

        int rose = 15;
        int chrysanthemum = 15;
        int pion = 15;
        int gypsophila = 0;

        bouquet[0].quantity = rose;
        bouquet[1].quantity = chrysanthemum;
        bouquet[2].quantity = pion;
        bouquet[3].quantity = gypsophila;


//        for (Flower flower : bouquet) {
//            System.out.println(flower.toString());
//        }

//        for (Flower flower : bouquet) {
//            System.out.print(flower.getName() + " ");
//            System.out.println(flower.getQuantity() + " шт.");
//        }

        System.out.print("Букет в котором есть:");
        printListBouquet(bouquet);
        System.out.print(", будет стоить: " + calculationSumBouquet(bouquet) + " руб.");
        System.out.println(" и простоит: " + calculationMinLifeSpan(bouquet) + " дней.");
    }

    public static double calculationSumBouquet(Flower[] bouquet) {
        double sum = 0;
        for (Flower flower : bouquet) {
            sum = sum + (flower.getQuantity() * flower.getCost());
        } return sum * 1.10;
    }
    public static void printListBouquet(Flower[] bouquet) {
        for (Flower flower : bouquet) {
            if (flower.getQuantity() > 0) {
                System.out.print(" " + flower.getName() + " " + flower.getQuantity() + " шт.");
            }
        }
    }
    public static int calculationMinLifeSpan(Flower[] bouquet) {
        int minLifeSpan = 1000000;
        for (Flower flower : bouquet) {
            if (minLifeSpan > flower.getLifeSpan()) {
                minLifeSpan = flower.getLifeSpan();
            }
        } return minLifeSpan;
    }
}