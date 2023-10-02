import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Emboar extends Pokemon {

    public Emboar() {
        setStats(110, 123, 65, 100, 65, 65);
        setType(Type.FIRE);
        addType(Type.FIGHTING);
        addMoves();
    }

    public Emboar(String name, int level) {
        super(name, level);
        setStats(110, 123, 65, 100, 65, 65);
        setType(Type.FIRE);
        addType(Type.FIGHTING);
        addMoves();
    }

    public void addMoves(){
        setMove(new WingAttack());
        addMove(new MudSlap());
        addMove(new Frustration());
        addMove(new LightScreen());
    }

}
