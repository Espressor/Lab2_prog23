import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lotad extends Pokemon {
    public Lotad() {
        setType(Type.WATER);
        addType(Type.GRASS);
        setStats(40, 30, 30, 40, 50, 30);
        addMoves();
    }

    public Lotad(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        addType(Type.GRASS);
        setStats(40, 30, 30, 40, 50, 30);
        addMoves();
    }

    public void addMoves() {
        setMove(new ShadowPunch());
        addMove(new LightScreen());
        addMove(new PoisonGas());
    }
}
