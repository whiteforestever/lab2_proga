package MyPokemons.Raichu;

import MyPokemons.Pichu.ThunderShock;
import MyPokemons.Pikachu.Discharge;
import MyPokemons.Pikachu.Pikachu;
import MyPokemons.Shelmet.Swagger;
import ru.ifmo.se.pokemon.Type;

public class Raichu extends Pikachu{
    public Raichu(String name, int level){
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(60, 90, 55, 90, 80, 110);
        Swagger swagger = new Swagger(0, 85);
        ThunderShock thunderShock = new ThunderShock(40, 100);
        Discharge discharge = new Discharge(80, 100);
        ChargeBeam chargeBeam = new ChargeBeam(50, 90);
        super.setMove(swagger, thunderShock, discharge, chargeBeam);

    }
}

