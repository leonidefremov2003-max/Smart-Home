package org.example;

public class SmartLight extends SmartDevice implements Controllable {

    private int brightness;    // Яркость лампы

    public SmartLight(String name, RoomType room, int initialBrightness) {
        super(name, room);
        this.brightness = initialBrightness;
    }


    public void increaseValue() {          // Реализация метода
        if (brightness < 100) {
            brightness += 10;
            System.out.println(name + "Яркость прибавлена на " + brightness);
        } else {
            System.out.println(name + "Яркость уже максимальна");
        }
    }
    public void decreaseValue() {
        if (brightness > 0) {
            brightness -= 10;
            System.out.println(name + "Яркость понижена на " + brightness);
        } else {
            System.out.println(name + "Яркость уже минимальна");
        }
    }

    public String getStatus() {
        return "Лампа \"" + name + "\" в комнате " + room +
                ", состояние: " + (isOn ? "включена" : "выключена") +
                ", яркость: " + brightness;
    }

    public int getBrightness() {
        return brightness;
    }
}
