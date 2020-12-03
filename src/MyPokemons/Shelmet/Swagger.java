package MyPokemons.Shelmet;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove{

    public Swagger(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    protected String describe(){
        String[] res = this.getClass().toString().split("\\.");
        return "attacks by " + res[res.length-1];
    }

    protected void applyOppEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, +2);
    }
    
}
