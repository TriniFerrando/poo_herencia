package org.trini.pooherencia;

public class Alumno extends Persona {
    private String institucion;
    private String notaMatematica;
    private String notaHistoria;
    private String notaCastellano;

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(String notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public String getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(String notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public String getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(String notaCastellano) {
        this.notaCastellano = notaCastellano;
    }
}
