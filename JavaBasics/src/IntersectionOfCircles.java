import java.util.Scanner;

public class IntersectionOfCircles {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] firstCircleArgs = console.nextLine().split(" ");
        String[] secondCircleArgs = console.nextLine().split(" ");

        double[] firstCircleParams = new double[3];
        for (int i = 0; i < firstCircleParams.length; i++) {
            firstCircleParams[i] = Double.parseDouble(firstCircleArgs[i]);
        }

        Circle firstCircle = new Circle();
        firstCircle.center.setX(firstCircleParams[0]);
        firstCircle.center.setY(firstCircleParams[1]);
        firstCircle.setRadius(firstCircleParams[2]);


        double[] secondCircleParams = new double[3];
        for (int i = 0; i < secondCircleParams.length; i++) {
            secondCircleParams[i] = Double.parseDouble(secondCircleArgs[i]);
        }

        Circle secondCircle = new Circle();
        secondCircle.center.setX(secondCircleParams[0]);
        secondCircle.center.setY(secondCircleParams[1]);
        secondCircle.setRadius(secondCircleParams[2]);

        if (DoIntersect(firstCircle, secondCircle)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean DoIntersect(Circle first, Circle second) {
        double distance = CalcDistance(first.center, second.center);

        if (distance <= first.radius + second.radius) {
            return true;
        } else {
            return false;
        }
    }

    private static double CalcDistance(Circle.Point c1Center, Circle.Point c2Center) {
        double distance = Math.sqrt(Math.pow((c1Center.getX() - c2Center.getX()), 2) + Math.pow((c1Center.getY() - c2Center.getY()), 2));

        return distance;
    }


    public static class Circle {

        private Point center = new Point();
        private double radius;

        public double getRadius() {
            return radius;
        }

        private void setRadius(double radius) {
            this.radius = radius;
        }

        private class Point {
            private double getX() {
                return X;
            }

            private void setX(double x) {
                X = x;
            }

            private double getY() {
                return Y;
            }

            private void setY(double y) {
                Y = y;
            }

            private double X;
            private double Y;
        }
    }
}




