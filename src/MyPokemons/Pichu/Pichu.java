package MyPokemons.Pichu;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import MyPokemons.Shelmet.Swagger;

public class Pichu extends Pokemon {
    public Pichu(String name, int level){
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(20, 40, 15, 35, 35, 60);
        Swagger swagger = new Swagger(0, 85);
        ThunderShock thunderShock = new ThunderShock(40, 100);
        super.setMove(swagger, thunderShock);

    }
}

