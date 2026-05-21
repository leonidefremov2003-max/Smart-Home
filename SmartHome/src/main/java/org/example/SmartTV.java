package org.example;

public class SmartTV extends SmartDevice implements Controllable {

    private int brightness;          // Яркость у телевизора

    public SmartTV(String name, RoomType room, int initialBrightness) {
        super(name, room);
        this.brightness = initialBrightness;
    }

    public void increaseValue() {            // Реализация метода
        if(brightness < 100) {
            brightness += 10;
            System.out.println(name + "Яркость прибавлена на " + brightness);
        } else {
            System.out.println(name + "Яркость уже максимальна ");
        }
    }
    public void decreaseValue() {
        if(brightness > 0) {
            brightness -= 10;
            System.out.println(name + "Яркость уменьшина на " + brightness);
        } else {
            System.out.println(name + "Яркость уже на минимуме");
        }
    }
     public String getStatus() {
         return "Телевизор \"" + name + "\" в комнате " + room +
                 ", состояние: " + (isOn ? "включен" : "выключен") +
                 ", яркость: " + brightness;
     }

     public int getBrightness() {
        return brightness;
     }
}
