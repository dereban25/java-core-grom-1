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


        String[] ordercityListFrom = {"Киев", "Одесса", "Днепр", "Харьков"};
        String[] ordercityListTo = {"Киев", "Одесса", "Днепр", "Харьков"};
        boolean cityCheck = false;

        for (int i = 0; i < ordercityListFrom.length; i++) {
            if (getCustomerOwned().getCity().equals(ordercityListFrom[i])) {

                for (int j = 0; j < ordercityListTo.length; j++) {

                    if (getShipToCity().equals(ordercityListTo[j])) {
                        cityCheck = true;

                    }
                }
            }

        }

        if (cityCheck == true && getBasePrice() > 100 && getCustomerOwned().getGender() == "Женский") {
            setDateConfirmed(new Date());
        }


    }

    @Override
    public void calculatePrice() {
        double comission = 0.15;

        if (getShipToCity().equals("Киев") || getShipToCity().equals("Одесса")) {
            comission = 0.10;
        }


        setTotalPrice(getBasePrice() + (getBasePrice() * comission));
        if (getTotalPrice() > 1000) {
            setTotalPrice(getTotalPrice() - (getTotalPrice() * 0.05));
        }


    }


}
