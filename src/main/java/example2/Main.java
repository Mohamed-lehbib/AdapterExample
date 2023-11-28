package example2;

public class Main {

    public static void main(String[] args) {
        ICharger charger = new TypeCToLightningAdap();
        Iphone iphone = new Iphone();
        iphone.setCharger(charger);
        iphone.charging();

    }
}
