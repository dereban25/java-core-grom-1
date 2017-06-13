package lesson10.dz1;

        import java.util.Date;

/**
 * Created by vaha on 11.06.2017.
 */
public class FurnitureOrder extends Order {

    private String furnitureCode;


    public FurnitureOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {


        if ((getCustomerOwned().getCity().equals("Киев") || getCustomerOwned().getCity().equals("Львов")) && getTotalPrice() >= 500 && (!getCustomerOwned().getName().equals("Тест"))) {
            setDateConfirmed(new Date());
        }


    }

    @Override
    public void calculatePrice() {

        double totalPrice;

        if (getBasePrice() < 5000) {

            totalPrice = +getBasePrice() + (getBasePrice() * 0.05);
        } else {
            totalPrice = +getBasePrice() + (getBasePrice() * 0.02);
        }

        setTotalPrice(totalPrice);


    }
}
