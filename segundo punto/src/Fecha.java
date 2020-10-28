public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    //Constructor por defecto
    public Fecha() {
    }

    //Constructor con parámetros
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //Métodos get y set
    public int getDia() {
        return dia;
    }

    public void setDia(int d) {
        this.dia = d;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int m) {
        this.mes = m;
    }

    public int getAño() {
        return anio;
    }

    public void setAño(int a) {
        this.anio = a;
    }

    //Comprobar si la fecha es correcta
    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = anio > 0;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }

    //Comprobar si el año es bisiesto
    //Método privado invocado desde el método fechaCorrecta
    private boolean esBisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);
    }

    public void diaSiguiente() {
        dia++;
        if (!fechaCorrecta()) {
            dia = 1;
            mes++;
            if (!fechaCorrecta()) {
                mes = 1;
                anio++;
            }
        }
    }

    //Método para comprobar si la fecha es mayor que la que se recibe
    public boolean esMayorQue(Fecha f) {
        if (anio > f.anio) {
            return true;
        } else if (anio == f.anio && mes > f.mes) {
            return true;
        } else if (anio == f.anio && mes == f.mes && dia > f.dia) {
            return true;
        }
        return false;
    }

    //Método para mostrar la fecha
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (dia < 10) {
            sb.append("0");
        }
        sb.append(dia);
        sb.append("-");
        if (mes < 10) {
            sb.append("0");
        }
        sb.append(mes);
        sb.append("-");

        sb.append(anio);
        return sb.toString();
    }
}