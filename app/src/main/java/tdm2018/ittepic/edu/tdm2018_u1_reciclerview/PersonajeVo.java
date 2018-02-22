package tdm2018.ittepic.edu.tdm2018_u1_reciclerview;

/**
 * Created by Jair on 13/02/2018.
 */

public class PersonajeVo {
    private String nombre;
    private String info;
    private int foto;

    public PersonajeVo(){

    }

    public PersonajeVo(String nombre, String info, int foto) {
        this.nombre = nombre;
        this.info = info;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
