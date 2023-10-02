import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class PoisonGas extends StatusMove {
    public PoisonGas() {
        accuracy = 90;
        type = Type.POISON;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.poison(p);
    }

    @Override
    protected String describe(){
        return "окутывает оппонента ядовитым газом";
    }
}
