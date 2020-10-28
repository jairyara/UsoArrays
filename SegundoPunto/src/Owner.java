import java.util.Date;

public class Owner {

    private String name;
    private String address;
    private String city;
    private Date birth;
    private long phone;
    private String email;
    private long DNI;
    private Pet pet;


    public Owner(String name, String address, String city, Date birth, long phone, String email, long DNI, Pet pet) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
        this.DNI = DNI;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Dueño{" +
                "Nombre:'" + name + '\'' +
                ", Dirección:'" + address + '\'' +
                ", Ciudad:'" + city + '\'' +
                ", Fecha de nacimiento:" + birth +
                ", Phone:" + phone +
                ", Correo electrónico:'" + email + '\'' +
                ", Número de identificación:" + DNI +
                ", ID Mascota:" + pet +
                '}';
    }
}
