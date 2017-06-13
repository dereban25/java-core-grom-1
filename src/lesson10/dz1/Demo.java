package lesson10.dz1;

import java.util.Date;

/**
 * Created by vaha on 13.06.2017.
 */
public class Demo {

    public static void main(String[] args) {

        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Телефон",new Date(),"Одесса",10000,new Customer("Аня","Киев","Женский"), 24);
        ElectronicsOrder electronicsOrder2 = new ElectronicsOrder("Гитара",new Date(),"Херсон",100,new Customer("Петя","Киев","Мужской"),12);


        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Тумба",new Date() , "Одесса", 1000, new Customer("Тест", "Львов", "Женский"),"0x1");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Стол",new Date() , "Николаев", 6000, new Customer("Катя", "Львов", "Женский"),"0x2");


        electronicsOrder1.calculatePrice();
        electronicsOrder1.validateOrder();
        electronicsOrder1.confirmShipping();

        electronicsOrder2.calculatePrice();
        electronicsOrder2.validateOrder();
        electronicsOrder2.confirmShipping();


        System.out.println(electronicsOrder1.getItemName() + " " + electronicsOrder1.getTotalPrice() + " " + " Дата создания " + electronicsOrder1.getDateCreated());
        System.out.println(electronicsOrder1.getDateConfirmed() + " Дата подтверждения ");
        System.out.println(electronicsOrder1.getDateShipped() + " Дата отправки ");

        System.out.println("********************************************");

        System.out.println(electronicsOrder2.getItemName() + " " + electronicsOrder2.getTotalPrice() + " " + " Дата создания " + electronicsOrder2.getDateCreated());
        System.out.println(electronicsOrder2.getDateConfirmed() + " Дата подтверждения ");
        System.out.println(electronicsOrder2.getDateShipped() + " Дата отправки ");


        System.out.println( "/////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();



        furnitureOrder1.calculatePrice();
        furnitureOrder1.validateOrder();
        furnitureOrder1.confirmShipping();

        furnitureOrder2.calculatePrice();
        furnitureOrder2.validateOrder();
        furnitureOrder2.confirmShipping();




        System.out.println(furnitureOrder1.getItemName() + " " + furnitureOrder1.getTotalPrice() + " " + " Дата создания " + furnitureOrder1.getDateCreated());
        System.out.println(furnitureOrder1.getDateConfirmed() + " Дата подтверждения ");
        System.out.println(furnitureOrder1.getDateShipped() + " Дата отправки ");

        System.out.println("********************************************");

        System.out.println(furnitureOrder2.getItemName() + " " + furnitureOrder2.getTotalPrice() + " " + " Дата создания " + furnitureOrder2.getDateCreated());
        System.out.println(furnitureOrder2.getDateConfirmed() + " Дата подтверждения ");
        System.out.println(furnitureOrder2.getDateShipped() + " Дата отправки ");


        int a = 10;
        System.out.println( a += 20);

    }
}
