package domain;

public class Zapdos extends Pokemon implements EletricType, FlyingType {

    public Zapdos(int hp, int cp) {
        super(hp, cp);
    }

    @Override
    public void attack() {
        wingAttack();
        thunderbolt();
    }

    @Override
    public void wingAttack() {
        System.out.println("Zapdos uses wingAttack!");
    }

    @Override
    public void thunderbolt() {
        System.out.println("Zapdos uses thunderbolt!");
    }

    @Override
    public void thunder() {
        System.out.println("Zapdos uses thunder!");
    }

}
