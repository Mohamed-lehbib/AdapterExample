package example2;

public class TypeCToLightningAdap implements ICharger {

    TypeCCharger charger = new TypeCCharger();
    @Override
    public void charging() {
        System.out.println(charger.charging() + " and a type c to lightning adapter");
    }
}
