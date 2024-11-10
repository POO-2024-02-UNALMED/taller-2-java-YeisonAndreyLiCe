import java.util.Arrays;
import java.util.List;

public class Asiento {
    private static final List<String> COLORES_PERMITIDOS = Arrays.asList(
        "rojo",
        "azul",
        "verde",
        "amarillo",
        "negro",
        "blanco"
    );
    public String color;
    public int precio;
    public int registro;

    public void cambiarColor(String color) {
        if (COLORES_PERMITIDOS.contains(color.toLowerCase())) {
            this.color = color;
        }
    }

    public int getRegistro() {
        return registro;
    }

}
