import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ShadowPunch extends PhysicalMove {
    public ShadowPunch(){
        power = 60;
        type = Type.GHOST;
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    protected String describe(){
        return "наносит удар из тени. От него невозможно уклониться";
    }
}
