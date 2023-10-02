import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dusclops extends Pokemon {
    public Dusclops() {
        setType(Type.GHOST);
        setStats(40, 70, 130, 60, 130, 25);
        addMoves();
    }

    public Dusclops(String name, int level){
        super(name, level);
        setType(Type.GHOST);
        setStats(40, 70, 130, 60, 130, 25);
        addMoves();
    }

    public void addMoves(){
        setMove(new ShadowPunch());
        addMove(new LightScreen());
        addMove(new PoisonGas());
        addMove(new DefenceCurl());
    }
}
