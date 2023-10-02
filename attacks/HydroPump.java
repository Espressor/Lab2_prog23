import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {
    public HydroPump(){
        power = 110;
        accuracy = 80;
        type = Type.WATER;
    }

    @Override
    protected String describe(){
        return "выбрасывает в оппонента струю воды под высоким давлением";
    }
}
