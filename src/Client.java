import java.util.ArrayList;

public class Client {
    private String dni;
    private String name;
    private String lastName;
    private String address;
    private ArrayList<Sale> sale;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Sale> getSale() {
        return sale;
    }

    public void setSale(ArrayList<Sale> sale) {
        this.sale = sale;
    }

}
