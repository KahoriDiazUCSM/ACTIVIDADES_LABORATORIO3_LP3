public class Weapon {
    private TipoDeArma tipoDeArma;
    private int baseDamage;

    public Weapon(TipoDeArma tipoDeArma, int baseDamage) {
        this.tipoDeArma = tipoDeArma;
        this.baseDamage = baseDamage;
    }

    public TipoDeArma getTipoDeArma() {
        return tipoDeArma;
    }

    public void setTipoDeArma(TipoDeArma tipoDeArma) {
        this.tipoDeArma = tipoDeArma;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int calcularDaño(int level) {
        return tipoDeArma.calcularDaño(baseDamage, level);
    }
}
