public class Task05 {

    public static final int RADIUS = 5;

    public static void main(String[] args) {
        System.out.println("Задание №5");
        double area = Math.PI * (RADIUS * RADIUS);
        System.out.println("Площадь круга равна: " + Math.round(area));
        double circumference = Math.PI * 2 * RADIUS;
        System.out.println("Площадь окружности равна: " + Math.round(circumference));
    }
}
