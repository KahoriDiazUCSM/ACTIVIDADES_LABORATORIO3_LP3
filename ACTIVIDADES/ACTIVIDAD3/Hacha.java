public class Hacha implements TipoDeArma {
    @Override
    public int calcularDaño(int baseDamage, int level) {
        return baseDamage + (level * 7);  -> Cálculo de daño específico para el hacha
    }
}
