void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj współrzędne pierwszego punktu:");
    System.out.print("x1: ");
    double x1 = scanner.nextDouble();
    System.out.print("y1: ");
    double y1 = scanner.nextDouble();

    System.out.println("Podaj współrzędne drugiego punktu:");
    System.out.print("x2: ");
    double x2 = scanner.nextDouble();
    System.out.print("y2: ");
    double y2 = scanner.nextDouble();

    Point p1 = new Point(x1, y1);
    Point p2 = new Point(x2, y2);

    double distance = Point.distance(p1, p2);

    System.out.println("Odległość: " + distance);
}

record Point(double x, double y) {

    Point() {
        this(0, 0);
    }

    public static double distance(Point a, Point b) {
        double dx = a.x() - b.x();
        double dy = a.y() - b.y();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

