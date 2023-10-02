import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DefenceCurl extends SpecialMove {
    public DefenceCurl() {
        accuracy = 0;
        type = Type.NORMAL;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, 1);
    }
    @Override
    protected String describe(){
        return "скручивается, пряча слабые места и повышя защиту";
    }
}
