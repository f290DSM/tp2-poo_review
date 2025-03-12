import domain.Charmander;

public class App {
    public static void main(String[] args) throws Exception {
        var charmander = new Charmander(1000, 2000);
        System.out.println(charmander);
        charmander.iChooseYou();
        charmander.attack();
    }
}
