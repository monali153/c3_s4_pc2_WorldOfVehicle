package main;

import derived.ElectricEngine;
import derivedClass.CngEngine;
import derivedClass.DieselEngine;
import derivedClass.PetrolEngine;

public class Implementation {

    public static void main(String[] args) {


        ElectricEngine object = new ElectricEngine(123456789129L, 22.5, 40, "Voltage");

        System.out.println("Electric Engine Details\n");
        object.show();

        PetrolEngine petrol = new PetrolEngine(145623789232L, 52.2, 40, 30, "Petrol", 2);

        DieselEngine diesel = new DieselEngine(115623781224L, 54.2, 32.5, 32, "Diesel", 3);

        CngEngine cng = new CngEngine(171562378922L, 50.2, 30.1, 40, "CNG", 1);

        System.out.println("IC Engine Details\n");
        petrol.show();
        diesel.show();
        cng.show();


    }
}
