package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {

    private Boolean abierta = true;
    private Integer codigo;
    private Integer contador = 0;

    public Boolean estaAbierta() {
        return this.abierta;
    }

    public void abrir(Integer codigo) {
        if (codigoCorrecto(codigo)) {
            this.abierta = true;
            contador = 0;
        } else {
            contador = contador + 1;
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

    public Boolean estaBloqueada() {
        return this.contador >= 3;
    }

}
