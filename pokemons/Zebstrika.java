import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zebstrika extends Pokemon {
    public Zebstrika(){
        setStats(75, 100, 63, 80, 63, 116);
        setType(Type.ELECTRIC);
        addMoves();
    }

    public Zebstrika(String name, int level){
        super(name, level);
        setStats(75, 100, 63, 80, 63, 116);
        setType(Type.ELECTRIC);
        addMoves();
    }

    public void addMoves(){
        setMove(new ThunderWave());
        addMove(new SwordsDance());
        addMove(new HydroPump());
    }
}
