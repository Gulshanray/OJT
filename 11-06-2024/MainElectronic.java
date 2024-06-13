


import comelectronics.electronics.SmartPhone;

public class MainElectronic {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Apple", "iPhone 13");

        smartPhone.powerOn();
        smartPhone.connectToWiFi();
        smartPhone.makeCall();
    }
}

