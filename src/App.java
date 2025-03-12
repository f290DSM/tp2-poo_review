import java.util.List;

import domain.Blaziken;
import domain.Charmander;
import domain.EletricType;
import domain.FireType;
import domain.FlyingType;
import domain.Pikachu;
import domain.Pokemon;
import domain.Squartle;
import domain.Zapdos;

public class App {
    public static void main(String[] args) throws Exception {
        // LiveShare: https://l1nq.com/f290dsmtp2
        var charmander = new Charmander(1000, 2000);
        var squartle = new Squartle(588, 1200);
        var pikachu = new Pikachu(3000, 1900);
        var blaziken = new Blaziken(4000, 2000);
        var zapdos = new Zapdos(1000, 2000);

        String template = """
                Detalhes de Herança e Polimorfismo
                Instancia de Pokemon: %s
                Instancia de FireType: %s
                Instancia de EletricType: %s
                Instancia de FlyingType: %s
                Instancia de  %s

                """;

        List<Pokemon> pokemons = List.of(pikachu, 
            charmander, squartle, 
            blaziken, zapdos);

        for (Pokemon pokemon : pokemons) {
            System.out.println();
            System.out.println(pokemon.getClass().getSimpleName());
            System.out.println();
            if (pokemon instanceof FireType) {
                pokemon.attack();
            }
            
            // System.out.println(String.format(template, 
            // pokemon instanceof Pokemon, 
            // pokemon instanceof FireType,
            // pokemon instanceof EletricType, 
            // pokemon instanceof FlyingType, 
            // pokemon.getClass().getSimpleName()));
        }

    }
}
