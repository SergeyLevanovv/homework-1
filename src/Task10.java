public class Task10 {
    public static final int HEIGHT = 185;
    public static final int WEIGHT = 80;

    public static void main(String[] args) {
        System.out.println("Задание №10");
        int idealWeight = HEIGHT - 110; // 75
        int nWeight = idealWeight - WEIGHT;
        System.out.println("Нужно: " + nWeight + " КГ.");
    }
}
