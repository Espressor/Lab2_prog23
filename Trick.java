import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Trick  extends StatusMove {
    public Trick(){
        accuracy = 100;
        type = Type.PSYCHIC;
    }

    @Override
    protected String describe() {
        return "застаёт цель в расплох и меняется с ней предметами";
    }
}
