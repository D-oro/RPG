public class Cleric extends Player{

    private Potion potion;

    public Cleric(int health, Potion potion){
        super(health);
        this.potion = potion;
    }

    public void heal(Player player){
        potion.effectPlayer(player);
    }
}
