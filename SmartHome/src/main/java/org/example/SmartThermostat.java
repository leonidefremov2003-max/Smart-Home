package org.example;

public class SmartThermostat extends SmartDevice implements Controllable {

    private int temperature;     // температура термостата

    public SmartThermostat(String name, RoomType room, int initialTemperature) {
        super(name, room);
        this.temperature = initialTemperature;
    }

    public void increaseValue() {          // Реализация метода

        if (temperature < 100) {
            temperature += 5;
            System.out.println(name + "Температура прибавлена на " + temperature);
        } else {
            System.out.println(name + "Температура на максимуме " );
        }
    }
    public void decreaseValue() {
        if (temperature > 0) {
            temperature -= 5;
            System.out.println(name + "Температура уменьшена  на " + temperature);
        } else {
            System.out.println(name + "Температура на минимуме " );
        }
    }

    public String getStatus() {
        return "Термостат \"" + name + "\" в комнате " + room +
                ", состояние: " + (isOn ? "включен" : "выключен") +
                ", температура: " + temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
