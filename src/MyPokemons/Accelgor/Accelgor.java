package MyPokemons.Accelgor;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import MyPokemons.Shelmet.Swagger;
import MyPokemons.Shelmet.SludgeBomb;
import MyPokemons.Shelmet.Venoshock;

public class Accelgor extends Pokemon{
    public Accelgor(String name, int level){
        super(name, level);
        super.setType(Type.BUG);
        super.setStats(80, 70, 40, 100, 65, 145);
        Swagger swagger = new Swagger(0D, 85D);
        SludgeBomb sludgeBomb = new SludgeBomb(90D, 100D);
        Agility agility = new Agility(0D, 0D);
        Venoshock venoshock = new Venoshock(65, 100);
        super.setMove(swagger, sludgeBomb, agility, venoshock);
    }
}

