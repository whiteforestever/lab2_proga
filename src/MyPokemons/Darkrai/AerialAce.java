package MyPokemons.Darkrai;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove{
    public AerialAce(double pow, double acc){
        super(Type.FLYING, pow, acc);
    }

    protected String describe(){
        String[] res = this.getClass().toString().split("\\.");
        return "attacks by " + res[res.length-1];
    }

    protected void	applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);
    }

    protected void	applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        p.setMod(Stat.EVASION, 0);
        p.setMod(Stat.ACCURACY, 0);
    }

}
