import java.util.Arrays;
import java.util.List;

public class Motor {
    public int numeroCilindros;
    public String tipo;
    public int registro;
    private static final List<String> TIPOS_PERMITIDOS = Arrays.asList(
        "gasolina",
        "electrico"
    );

    public void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    public void asignarTipo(String tipo) {
        if (TIPOS_PERMITIDOS.contains(tipo.toLowerCase())) {
            this.tipo = tipo;
        }
    }

    public int getRegistro() {
        return registro;
    }
}
