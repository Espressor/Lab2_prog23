import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Frustration extends PhysicalMove {
    public Frustration() {
        int Friendship = (int) (Math.random() * 255);
        power = Math.max(1, (255 - Friendship) / 2.5);
        accuracy = 100;
        type = Type.NORMAL;
    }

    @Override
    protected String describe() {
        return "атакует (урон больше, если покемону не нравится тренер)";
    }
}
