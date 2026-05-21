package org.example;


import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    private final List<SmartDevice> devices;          // Создал список всех устройств в доме

    public SmartHome() {
        devices = new ArrayList<>();
    }
         // Добавление устройства
    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println("Устройство \"" + device.getName() + "\" добавлено в систему.");
    }
       // Удаление устройста по имени
    public void removeDevice(SmartDevice device) {
        if (devices.remove(device)) {
            System.out.println("Устройство \"" + device.getName() + "\" удалено из системы.");
        }
    }
            // Поиск устройста по имени (без учета регистра)
    public SmartDevice getDeviceByName(String name) {
        for (SmartDevice d : devices) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }
       // Метод который включает все устройства в доме
    public void turnAllOn() {
        for (SmartDevice d : devices) {
            d.turnOn();
        }
    }
       // Метод который выключает все устройства в доме
    public void turnAllOff() {
        for (SmartDevice d : devices) {
            d.turnOff();
        }
    }
      // Метод который выводит статус всех устройств
    public void printAllStatuses() {
        System.out.println("=== Статус всех устройств ===");
        for (SmartDevice d : devices) {
            System.out.println(d.getStatus());
        }
    }
      // Сбор статистики
    public HomeStats getStats() {
        return new HomeStats(devices);         // создаю объект статистики, передавая текущий список устройств
    }


    public static class HomeStats {

        private final int totalDevices;
        private int totalOn;
        private int totalOff;


        private int kitchenCount;
        private int bedroomCount;
        private int hallCount;
        private int hallwayCount;

        public HomeStats(List<SmartDevice> devices) {
            totalDevices = devices.size();
            for (SmartDevice d : devices) {
                if (d.isOn()) {
                    totalOn++;
                } else {
                    totalOff++;
                }
                switch (d.getRoom()) {
                    case KITCHEN: kitchenCount++; break;
                    case BEDROOM: bedroomCount++; break;
                    case HALL: hallCount++; break;
                    case HALLWAY: hallwayCount++; break;
                }
            }
        }

        @Override
        public String toString() {
            return "=== Статистика умного дома ===\n" +
                    "Всего устройств: " + totalDevices + "\n" +
                    "Включено: " + totalOn + ", Выключено: " + totalOff + "\n" +
                    "По комнатам: Кухня=" + kitchenCount +
                    ", Спальня=" + bedroomCount +
                    ", Зал=" + hallCount +
                    ", Коридор=" + hallwayCount;
        }
    }

    }
