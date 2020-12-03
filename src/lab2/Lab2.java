package lab2;

import MyPokemons.Accelgor.Accelgor;
import MyPokemons.Darkrai.*;
import MyPokemons.Pichu.Pichu;
import MyPokemons.Pikachu.Pikachu;
import MyPokemons.Raichu.Raichu;
import MyPokemons.Shelmet.Shelmet;
import ru.ifmo.se.pokemon.Battle;

public class Lab2{
    public static void main(String[] args) {
        Battle b = new Battle();
        Darkrai p1 = new Darkrai("Darkrai", 1);
        Shelmet p2 = new Shelmet("Shelmet", 1);
        Accelgor p3 = new Accelgor("Accelgor", 1);
        Pichu p4 = new Pichu("Pichu", 1);
        Pikachu p5 = new Pikachu("Pikachu", 1);
        Raichu p6 = new Raichu("Raichu", 1);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();

    }
    
}
