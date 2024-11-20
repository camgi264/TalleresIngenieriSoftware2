interface Notificacion {
    void enviar();
}

class NotificacionSMS implements Notificacion {
    @Override
    public void enviar() {
        System.out.println("ENVIANDO NOTIFICACIÓN POR SMS");
    }
}

class NotificacionWhatsapp implements Notificacion {
    @Override
    public void enviar() {
        System.out.println("ENVIANDO NOTIFICACIÓN POR WHATSAPP");
    }
}

class Tarea {
    private String descripcion;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

class GestorNotificaciones {
    public void enviarNotificacion(Notificacion notificacion) {
        notificacion.enviar();
    }
}

class GestorTareas {
    public void insertarTarea(Tarea tarea) {
        System.out.println("Insertando tarea: " + tarea.getDescripcion());
    }

    public void leerTarea() {
        System.out.println("OBTENIENDO TAREA");
    }
}

public class Sistema {
    private GestorNotificaciones gestorNotificaciones;
    private GestorTareas gestorTareas;

    public Sistema() {
        this.gestorNotificaciones = new GestorNotificaciones();
        this.gestorTareas = new GestorTareas();
    }

    public void enviarNotificacion(Notificacion notificacion) {
        gestorNotificaciones.enviarNotificacion(notificacion);
    }

    public void insertarTarea(Tarea tarea) {
        gestorTareas.insertarTarea(tarea);
    }

    public void leerTarea() {
        gestorTareas.leerTarea();
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Notificacion notificacionSMS = new NotificacionSMS();
        sistema.enviarNotificacion(notificacionSMS);

        Notificacion notificacionWhatsapp = new NotificacionWhatsapp();
        sistema.enviarNotificacion(notificacionWhatsapp);

        Tarea tarea = new Tarea("Completar reporte de ventas");
        sistema.insertarTarea(tarea);
        sistema.leerTarea();
    }
}
