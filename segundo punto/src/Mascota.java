import java.util.Calendar;

public class Mascota {
    private String nombre;
    private String direccion;
    private int codigoPostal;
    private String ciudad;
    private Fecha fechaNacimiento;

    //Constructor por defecto
    public Mascota() {
        fechaNacimiento = new Fecha();
    }

    //Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fecha) {
        fechaNacimiento.setDia(fecha.getDia());
        fechaNacimiento.setDia(fecha.getMes());
        fechaNacimiento.setDia(fecha.getAño()); //Ojo por la ñ
    }

    //Método para mostrar los datos de las personas según el formato pedido
    @Override
    public String toString() {
        StringBuilder sm = new StringBuilder();
        sm.append("Nombre: ");
        sm.append(nombre);
        sm.append("\nFecha de Nacimiento: ");
        sm.append(fechaNacimiento);
        sm.append("\nDirección: ");
        sm.append(direccion);
        sm.append("\n");
        sm.append(codigoPostal);
        sm.append("\n");
        sm.append(ciudad);
        sm.append("\n");
        return sm.toString();
    }

    // Método que comprueba si la persona es mayor de edad

    public boolean esMayorDeEdad() {
        Calendar hoy = Calendar.getInstance();
        int añoActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH);
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);
        if (añoActual - fechaNacimiento.getAño() > 18) {
            return true;
        } else if (añoActual - fechaNacimiento.getAño() == 18 && mesActual > fechaNacimiento.getMes()){
            return true;
        } else if(añoActual - fechaNacimiento.getAño() == 18 &&
                mesActual == fechaNacimiento.getMes() &&
                diaActual >= fechaNacimiento.getDia()) {
            return true;
        }
        return false;
    }
}