public class SquareTest {
    public static void main(String[] args) {
        Rectangle o1 = new Rectangle(5, 10);
        Rectangle o2 = new Rectangle(15, 15);
        Rectangle o3 = new Square(15);

        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: " + o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));
    }
}
