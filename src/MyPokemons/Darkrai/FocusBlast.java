package MyPokemons.Darkrai;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends SpecialMove{
    public FocusBlast(double pow, double acc){
        super(Type.FIGHTING, pow, acc);
    }

    protected void	applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);
    }

    protected String describe(){
        String[] res = this.getClass().toString().split("\\.");
        return "attacks by " + res[res.length-1];
    }

    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }
}
