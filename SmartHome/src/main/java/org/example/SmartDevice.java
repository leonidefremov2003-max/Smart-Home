package org.example;

public abstract class SmartDevice {

    protected String name;
    protected boolean isOn;
    protected RoomType room;


    public SmartDevice(String name, RoomType room) {
        this.name = name;
        this.room = room;
        this.isOn = false;

    }

    public final void turnOn() {
        isOn = true;
        System.out.println(name + " включен.");
    }

    public final void turnOff() {
        isOn = false;
        System.out.println(name + " выключен.");}


    public String getName() {
        return name;
    }
    public Boolean isOn() {
        return isOn;
    }
    public RoomType getRoom() {
        return room;
    }


    public abstract String getStatus();

}
