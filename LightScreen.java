import ru.ifmo.se.pokemon.*;

public class LightScreen extends StatusMove {
    public LightScreen() {
        accuracy = 0;
        type = Type.PSYCHIC;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect ef = new Effect().stat(Stat.SPECIAL_DEFENSE, -2).turns(5);
        p.addEffect(ef);
    }

    @Override
    protected String describe() {
        return "создаёт стену света, понижающуюю урон от специальной атаки";
    }
}
