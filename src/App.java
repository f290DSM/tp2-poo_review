import java.util.List;

import domain.pokemon.Blaziken;
import domain.pokemon.Charmander;
import domain.pokemon.EletricType;
import domain.pokemon.FireType;
import domain.pokemon.FlyingType;
import domain.pokemon.Pikachu;
import domain.pokemon.Pokemon;
import domain.pokemon.Squartle;
import domain.pokemon.Zapdos;

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
            System.out.println(String.format(template, 
            pokemon instanceof Pokemon, 
            pokemon instanceof FireType,
            pokemon instanceof EletricType, 
            pokemon instanceof FlyingType, 
            pokemon.getClass().getSimpleName()));
        }

    }
}
