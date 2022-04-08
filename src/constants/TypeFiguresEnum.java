package constants;

public enum TypeFiguresEnum {
    CIRCLE("Circle",1),
    SQUARE("Square", 2),
    RECTANGLE("Rectangle", 3),
    EQUILATERAL_TRIANGLE("Equilateral triangle", 4),
    ISOSCELES_TRIANGLE("Isosceles triangle", 5);

    private final String nombre;
    private final int opcion;

    TypeFiguresEnum(String nombre, int opcion) {
        this.nombre = nombre;
        this.opcion = opcion;
    }

    public String getName() {
        return nombre;
    }

    public int getOption() {
        return opcion;
    }
}