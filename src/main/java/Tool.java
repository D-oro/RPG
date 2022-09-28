public class Tool {

    Player player;

    private int effectOnHealth;

    public Tool(int effectOnHealth){
        this.effectOnHealth = effectOnHealth;
    }


    public void effectPlayer(Player player){
        player.setHealth(player.getHealth()+effectOnHealth);
        }

    public int getEffectOnHealthAsInteger() {
        return effectOnHealth;
    }
}


