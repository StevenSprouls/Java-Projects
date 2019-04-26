public class BetterRectangleTester {
    public static void main(String[] args) {

        BetterRectangle r = new BetterRectangle(1, 1, 20, 20);
        System.out.println("perimeter: " + r.getPerimeter()); //80
        System.out.println("area: " + r.getArea()); //400
        System.out.println();

        BetterRectangle r2 = new BetterRectangle(1, 1, 5, 1200);
        System.out.println("perimeter: " + r2.getPerimeter()); //2410
        System.out.println("area: " + r2.getArea()); //6000
        System.out.println();

        BetterRectangle r3 = new BetterRectangle(1, 1, 589, 7856);
        System.out.println("perimeter: " + r3.getPerimeter()); //16890
        System.out.println("area: " + r3.getArea()); //4627184

    }

}