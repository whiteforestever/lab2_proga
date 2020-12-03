package MyPokemons.Shelmet;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shelmet extends Pokemon {
    public Shelmet(String name, int level){
        super(name, level);
        super.setType(Type.BUG);
        super.setStats(50, 40, 85, 40, 65, 25);
        Venoshock venoshock = new Venoshock(65, 100);
        SludgeBomb sludgeBomb = new SludgeBomb(90, 100);
        Swagger swagger = new Swagger(0, 85);
        super.setMove(venoshock, sludgeBomb, swagger);
    }
}

