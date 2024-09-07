public class Hacha implements TipoDeArma {
    @Override
    public int calcularDaño(int baseDamage, int level) {
        return baseDamage + (level * 7);
    }
}
