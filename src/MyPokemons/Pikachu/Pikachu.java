package MyPokemons.Pikachu;

import MyPokemons.Pichu.Pichu;
import MyPokemons.Pichu.ThunderShock;
import MyPokemons.Shelmet.Swagger;
import ru.ifmo.se.pokemon.Type;

public class Pikachu extends Pichu{
    public Pikachu(String name, int level){
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(35, 55, 40, 50, 50, 90);
        Swagger swagger = new Swagger(0, 85);
        ThunderShock thunderShock = new ThunderShock(40, 100);
        Discharge discharge = new Discharge(80, 100);
        super.setMove(swagger, thunderShock, discharge);

    }
}

