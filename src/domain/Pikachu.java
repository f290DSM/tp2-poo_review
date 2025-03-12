package domain;

public class Pikachu extends Pokemon implements EletricType {

    public Pikachu(int hp, int cp) {
        super(hp, cp);
    }

    @Override
    public void attack() {
        thunderbolt();
    }

    @Override
    public void thunderbolt() {
        System.out.println("Pikachu uses Thunderbolt!");
    }

    @Override
    public void thunder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'thunder'");
    }

}
