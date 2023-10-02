import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;


public class WingAttack extends PhysicalMove {
    public WingAttack() {
        power = 60;
        accuracy = 100;
        type = Type.FLYING;
    }

    @Override
    protected String describe() {
        return "атакует соперника крыльями";
    }
}
