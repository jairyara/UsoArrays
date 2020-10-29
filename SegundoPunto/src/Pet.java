public class Pet {

    private int ID;
    private String name;
    private int age;
    private String genre;
    private String animal;
    private String size;
    private String breed;
    private Boolean vaccine;
    private Boolean dissability;

    public Pet(int ID, String name, int age, String genre, String animal, String size, String breed, Boolean vaccine, Boolean dissability) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.animal = animal;
        this.size = size;
        this.breed = breed;
        this.vaccine = vaccine;
        this.dissability = dissability;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Boolean getVaccine() {
        return vaccine;
    }

    public void setVaccine(Boolean vaccine) {
        this.vaccine = vaccine;
    }

    public Boolean getDissability() {
        return dissability;
    }

    public void setDissability(Boolean dissability) {
        this.dissability = dissability;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ");
        sb.append(ID);
        sb.append("}\n Nombre de la mascota: ");
        sb.append(name);
        sb.append("\n Edad de la mascota: ");
        sb.append(age);
        sb.append("\n Género de la mascota: ");
        sb.append(genre);
        sb.append("\n Tipo de animal: ");
        sb.append(animal);
        sb.append("\n Tamaño de la mascota: ");
        sb.append(size);
        sb.append("\n Está vacunado?: ");
        if (vaccine == true) {
            sb.append("Si");
        } else {
            sb.append("No");

        }
        sb.append("\n La mascota tiene discapacidad?: ");
        if (dissability == true) {
            sb.append("Si");
        } else {
            sb.append("No");
        }
        sb.append("\n Raza: ");
        sb.append(breed);
        sb.append("\n");
        return sb.toString();
    }
}
