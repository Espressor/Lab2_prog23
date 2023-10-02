import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roggenrola extends Pokemon {
    public Roggenrola() {
        setType(Type.ROCK);
        setStats(55, 75, 85, 25, 25, 15);
        addMoves();
    }

    public Roggenrola(String name, int level) {
        super(name, level);
        setType(Type.ROCK);
        setStats(55, 75, 85, 25, 25, 15);
        addMoves();
    }

    public void addMoves() {
        setMove(new ThunderWave());
        addMove(new SwordsDance());
        addMove(new HydroPump());
        addMove(new Trick());
    }
}
