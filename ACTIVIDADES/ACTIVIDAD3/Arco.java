public class Arco implements TipoDeArma {
    @Override
    public int calcularDaño(int baseDamage, int level) {
        return baseDamage + (level * 3);  -> Cálculo de daño específico para el arco
    }
}
