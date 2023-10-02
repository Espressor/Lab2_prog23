import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave() {
        accuracy = 90;
        type = Type.ELECTRIC;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
    }

    @Override
    protected String describe(){
        return "вызывает молнию, парализующую оппонента";
    }
}
