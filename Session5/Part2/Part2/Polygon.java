package Part2;

import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Math.sqrt;

public class Polygon extends Shape {

    protected ArrayList<Double> sides;

    /**
     * Create a new Polygon with a given sides.
     *
     * @param sides The sides of polygon.
     */
    public Polygon(double[] isides) {
        this.sides = new ArrayList<>();
        for (double temp : isides) {
            this.sides.add(temp);
        }
    }

    /**
     * get The sides collection.
     *
     * @return sides field.
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * calculate perimeter of polygon.
     *
     * @return perimeter
     */
    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
        for (double temp : sides) {
            perimeter += temp;
        }
        return perimeter;
    }

    /**
     * calculate area of polygon.
     *
     * @return area
     */
    @Override
    public double calculateArea() { // correct
        // if (this.getClass().getName().equals("Part2.Triangle")) {
        if (this instanceof Triangle) {
            return (sqrt(calculatePerimeter() / 2 * (calculatePerimeter() / 2 - sides.get(0))
                    * (calculatePerimeter() / 2 - sides.get(1)) * (calculatePerimeter() / 2 - sides.get(2))));
        } else {
            return (sides.get(0) * sides.get(1));
        }
    }

    /**
     * Determine whether the given polygon equals the polygon.
     *
     * @param o The polygon to be checked.
     * @return true if the given polygon is valid, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Polygon))
            return false;

        Polygon polygon = (Polygon) o;

        return getSides() != null ? getSides().equals(polygon.getSides()) : polygon.getSides() == null;
    }

    /**
     * Make a hashcode depends on sides.
     *
     * @return code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getSides());
    }

    /**
     * get a String for polygon and sides.
     *
     * @return a String.
     */
    @Override
    public String toString() {
        return "Shape is " + this.getClass().getName() + "\nsides : " + sides;
    }
}
