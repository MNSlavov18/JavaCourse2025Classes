package Figures;

public interface AreaCalculations {
    double getArea();

    default double calculateArea(Figure figure1) {
        if (validation()) {
            return this.getArea() + figure1.getArea();
        }
        return 0;
    }

    static double test()
    {
        return 100;
    }

    private boolean validation()
    {
        return true;
    }
}
