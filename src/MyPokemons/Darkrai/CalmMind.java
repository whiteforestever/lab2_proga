package MyPokemons.Darkrai;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class CalmMind extends StatusMove{
    public CalmMind(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }

    protected String describe(){
        String[] res = this.getClass().toString().split("\\.");
        return "attacks by " + res[res.length-1];
    }

    protected void	applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        p.setMod(Stat.SPECIAL_ATTACK, +1);
        p.setMod(Stat.SPECIAL_DEFENSE, +1);
    }

}
