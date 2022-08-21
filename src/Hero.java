public abstract class Hero implements HavingSuperAbility {
    public int damag;
    public int healt;
    public String supper;


    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public String getSupper() {
        return supper;
    }

    public void setSupper(String supper) {
        this.supper = supper;
    }

    public int getDamag() {
        return damag;
    }

    public void setDamag(int damag) {
        this.damag = damag;
    }
}


