package citahospitalbc.demo.dto;

public class Respuesta {
    String mensaje;
    Object respuesta;

    public Respuesta(String mensaje, Object respuesta){
        this.mensaje = mensaje;
        this.respuesta = respuesta;
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Object respuesta) {
        this.respuesta = respuesta;
    }
}
