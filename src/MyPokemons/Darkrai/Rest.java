package MyPokemons.Darkrai;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends StatusMove {
    public Rest(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }

    protected String describe(){
        String[] res = this.getClass().toString().split("\\.");
        return "attacks by " + res[res.length-1];
    }

    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().turns(2).stat(Stat.HP, 6);
        p.addEffect(e);
    }
}
