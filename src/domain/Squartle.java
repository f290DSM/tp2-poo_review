package domain;

public class Squartle extends Pokemon {

    public Squartle(int hp, int cp) {
        super(hp, cp);
    }

    @Override
    public void attack() {
        System.out.println("Squartle used Water Gun");
    }

}
