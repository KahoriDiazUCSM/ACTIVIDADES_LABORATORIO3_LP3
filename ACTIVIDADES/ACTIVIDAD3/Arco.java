public class Arco implements TipoDeArma {
    @Override
    public int calcularDaño(int baseDamage, int level) {
        return baseDamage + (level * 3);
    }
}
