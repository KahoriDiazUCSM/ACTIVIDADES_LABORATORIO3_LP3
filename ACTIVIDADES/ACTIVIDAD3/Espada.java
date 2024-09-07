public class Espada implements TipoDeArma {
    @Override
    public int calcularDaño(int baseDamage, int level) {
        return baseDamage + (level * 5);
    }
}
