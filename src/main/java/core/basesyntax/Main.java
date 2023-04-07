package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_FIGURE = 4;
        Figures[] figures = new Figures[NUMBER_FIGURE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int a = 0; a < figures.length; a++) {
            if (a <= figures.length / 2) {
                figures[a] = figureSupplier.getRandomFigure();
            } else {
                figures[a] = figureSupplier.getDefaultFigure();
            }
            figures[a].draw();
        }
    }
}
