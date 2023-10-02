import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dustox extends Pokemon {
    public Dustox() {
        setType(Type.BUG);
        addType(Type.POISON);
        setStats(60, 50, 70, 50, 90, 65);
        addMoves();
    }

    public Dustox(String name, int level) {
        super(name, level);
        setType(Type.BUG);
        setType(Type.POISON);
        setStats(60, 50, 70, 50, 90, 65);
        addMoves();
    }

    public void addMoves(){
        setMove(new ShadowPunch());
        addMove(new LightScreen());
    }
}
