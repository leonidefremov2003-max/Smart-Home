package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SmartHome home = new SmartHome();

        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));


        SmartLight kitchenLight = new SmartLight("Лампа на кухне", RoomType.KITCHEN, 50);
        SmartThermostat bedroomThermostat = new SmartThermostat("Термостат спальни", RoomType.BEDROOM, 22);
        SmartTV hallTV = new SmartTV("Телевизор в зале", RoomType.HALL, 50);


        home.addDevice(kitchenLight);
        home.addDevice(bedroomThermostat);
        home.addDevice(hallTV);


        System.out.println("\n--- Включаем все устройства ---");
        home.turnAllOn();


        System.out.println("\n--- Управление устройствами ---");
        kitchenLight.increaseValue();
        bedroomThermostat.increaseValue();
        hallTV.increaseValue();


        home.printAllStatuses();


        System.out.println("\n" + home.getStats());


        System.out.println("\n--- Выключаем все устройства ---");
        home.turnAllOff();


        System.out.println("\n" + home.getStats());
    }
}
