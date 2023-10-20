public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
    }

    public double yIntercept() {
        return roundedToHundredth(y1 - (slope() * x1));
    }

    public double slope() {
        return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
    }

    public String equation() {
        int numerator = y2 - y1;
        int denominator = x2 - x1;
        String slope = "";
        String yIntercept = "";

        if (numerator < 0 && denominator < 0) {
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        } else if (denominator < 0) {
            numerator *= -1;
            denominator = Math.abs(denominator);
        }

        if (slope() < 0 && slope() % 1 == 0) {
            slope += "-";
        }

        if (yIntercept() < 0) {
            yIntercept += " - " + Math.abs(yIntercept());
        } else {
            yIntercept += " + " + yIntercept();
        }

        if (Math.abs(slope()) == 1) {
            slope += "x";
        } else if (slope() % 1 == 0) {
                slope += slope() + "x";
        } else {
            slope += numerator + "/" + denominator + "x";
        }

        if (slope() == 0) {
            return "y = " + yIntercept();
        } else if (yIntercept() == 0) {
            return "y = " + slope + "x";
        } else {
            return "y = " + slope + yIntercept;
        }
    }

        public String coordinateForX(double xValue) {
            double yValue = slope() * xValue + yIntercept();
            return "(" + roundedToHundredth(xValue) + ", " + roundedToHundredth(yValue) + ")";
        }

        public double roundedToHundredth(double toRound) {
            if (toRound < 0) {
                return (int)(toRound * 100 - 0.5) / 100.0;
            } else {
                return (int)(toRound * 100 + 0.5) / 100.0;
            }
        }

        public String lineInfo() {
            String info = "The two points are: " + "(" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n";
            info += "The equation of the line between these points is: " + equation() + "\n";
            info += "The slope of the line is: " + slope() + "\n";
            info += "The y-intercept of the line is: " + yIntercept() + "\n";
            info += "The distance between the two points is " + distance();
            return info;
        }

    }









