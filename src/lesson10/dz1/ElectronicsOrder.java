package lesson10.dz1;

import java.util.Date;

/**
 * Created by vaha on 11.06.2017.
 */
public class ElectronicsOrder extends Order {
    private int guaranteeMonths;


    public ElectronicsOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {

        if ((getCustomerOwned().getCity().equals("Киев")) || (getCustomerOwned().getCity().equals("Одесса")) || (getCustomerOwned().getCity().equals("Днепр")) || (getCustomerOwned().getCity().equals("Харьков")) && (getShipToCity().equals("Киев") || getShipToCity().equals("Одесса") || getShipToCity().equals("Днепр") || getShipToCity().equals("Харьков")) && getTotalPrice() >= 100 && getCustomerOwned().getGender().equals("Женский")) {
            setDateConfirmed(new Date());
        }


    }

    @Override
    public void calculatePrice() {
        double comission = 15;

        if ((getShipToCity().equals("Киев")) || (getShipToCity().equals("Одесса"))) {
            comission = 10;
        }


        double totalPrice = +getBasePrice() + ((getBasePrice() * comission) / 100);
        if (totalPrice > 1000) {
            totalPrice = -(totalPrice * 5) / 100;
        }
        setTotalPrice(totalPrice);

    }


}
