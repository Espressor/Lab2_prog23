import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SwordsDance extends StatusMove {
    public SwordsDance(){
        accuracy = 0;
        type = Type.NORMAL;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe(){
        return "танцует, поднимая боевой дух и улучшая характеристики атаки";
    }
}
