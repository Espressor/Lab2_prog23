import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;


public class MudSlap extends SpecialMove {
    public MudSlap() {
        power = 20;
        accuracy = 100;
        type = Type.GROUND;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe() {
        return "бросает грязь в лицо сопернику, нанося урон и понижая точность";
    }
}
