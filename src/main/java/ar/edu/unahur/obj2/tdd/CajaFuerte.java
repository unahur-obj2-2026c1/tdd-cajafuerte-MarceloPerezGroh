package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {

    private Boolean abierta = true;
    private Integer codigo;

    public Boolean estaAbierta() {
        return this.abierta;
    }

    public void abrir(Integer codigo) {
        if (codigoCorrecto(codigo)) {
            this.abierta = true;
        }
    }

    public void cerrar(Integer codigo) {
        if (abierta()) {
            this.codigo = codigo;
            this.abierta = false;
        }
    }

    private boolean abierta() {
        return this.abierta.equals(true);
    }

    private boolean codigoCorrecto(Integer codigo) {
        return this.codigo.equals(codigo);
    }

}
