package domain;

public abstract class Pokemon {
    private int hp;
    private int cp;

    public Pokemon(int hp, int cp) {
        this.setCp(cp);
        this.setHp(hp);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp < 0) {
            System.out.printf("Valor de HP inválido. HP: %d\n", hp);
            return;
        }
        this.hp = hp;
    }

    public void setCp(int cp) {
        if(cp < 0) {
            System.out.printf("Valor de CP inválido. CP: %d\n", cp);
            return;
        }
        this.cp = cp;
    }

    public int getCp() {
        return cp;
    }

    public void iChooseYou() {
        System.out.printf("%s, I choose you!\n",
                this.getClass().getSimpleName());

    }

    public abstract void attack();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", cp=" + cp +
                '}';
    }

}
