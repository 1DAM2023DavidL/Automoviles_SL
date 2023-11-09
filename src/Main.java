import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Clientes
        Client client1 = new Client();
        client1.setDni("60815732T");
        client1.setName("Pepe");
        client1.setLastName("García");
        client1.setAddress("C/Rafaela de Antonio");


        Sale sale = new Sale();
        Sale sale2 = new Sale();
        Sale sale3 = new Sale();

        ArrayList<Sale> sales = new ArrayList<>();
        sales.add(sale); // posicion 0
        sales.add(sale2); // posicion 1
        sales.add(sale3); // posicion 2

        client1.setSale(sales);

        //Vehiculos
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setRegistration("ZR24");
        vehicle1.setBrand("BMW");
        vehicle1.setModel("Modelo_ejemplo");
        vehicle1.setColor("Black");
        vehicle1.setFuel("Gasoil");
        vehicle1.setEngine("Motor_ejemplo");
        vehicle1.setCv(700);

        Store store = new Store();
        Store store2 = new Store();
        Store store3 = new Store();

        ArrayList<Store> stores = new ArrayList<>();
        stores.add(store);
        stores.add(store2);
        stores.add(store3);
        vehicle1.setStore(stores);
        vehicle1.setSale(sales);

        //Almacen
        Store store1 = new Store();
        store1.setCode("001");
        store1.setDischargeDate("09/11/2023");
        store1.setVehicle(vehicle1);

        //Venta
        Sale sale = new Sale();
        sale.setCode("001");
        sale.setDateOfPayment("09/11/2023");
        sale.setMethodOfPayment("Visa");
        sale.setPrice(3000);

        Vehicle vehicle = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle vehicle3 = new Vehicle();

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicle);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);
        sale.setVehicles(vehicles);
   }
}