import java.util.Random;

public enum Boja {
    CRVENA,
    PLAVA,
    BRAON,
    ZUTA,
    CRNA,
    ZELENA,
    LJUBICASTA,
    NANDZARASTA;

    private static final Random PRNG = new Random();

    public static Boja randomBoja() {
        return boje[PRNG.nextInt(boje.length)];
}
    private static final Boja[] boje = values();

    }
