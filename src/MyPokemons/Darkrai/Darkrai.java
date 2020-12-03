package MyPokemons.Darkrai;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Darkrai extends Pokemon {
    public Darkrai(String name, int level){
        super(name, level);
        super.setType(Type.DARK);
        super.setStats(70, 90, 90, 135, 90, 125);
        AerialAce aerial_ace = new AerialAce(60, Double.MAX_VALUE);
        FocusBlast focusblast = new FocusBlast(120, 70);
        Rest rest = new Rest(0, 0);
        CalmMind calmmind = new CalmMind(0, 0);
        super.setMove(calmmind, rest, focusblast, aerial_ace);

    }
}

