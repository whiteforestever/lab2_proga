package MyPokemons.Raichu;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ChargeBeam extends SpecialMove {

    private static boolean chance(double probability){
        return (probability > Math.random());
    }

	public ChargeBeam(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }

    protected String describe(){
        String[] res = this.getClass().toString().split("\\.");
        return "attacks by " + res[res.length-1];
    }

    protected void	applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);
    }

    protected void applyOppEffects(Pokemon p){
        super.applySelfEffects(p);
        if(chance(0.7))
            p.setMod(Stat.SPECIAL_ATTACK, +1);
    }
    
}
