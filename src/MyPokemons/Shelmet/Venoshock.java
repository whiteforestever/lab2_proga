package MyPokemons.Shelmet;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Venoshock extends SpecialMove{
    public Venoshock(double pow, double acc){
        super(Type.POISON, pow, acc);
    }

    protected String describe(){
        String[] res = this.getClass().toString().split("\\.");
        return "attacks by " + res[res.length-1];
    }

    protected void	applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);
        if (def.getCondition() == Status.POISON){
            super.applyOppDamage(def, damage);
        }
    }
}
