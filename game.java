

public class game{
    public static void main(String[] arg)
    {

    
        player1 players =new player1("Ankit" ," GUN-AKM " ,100);
        System.out.println("Player Name : "+players.getName()+" | Health :"+players.getHealth()+" | Weapon :"+players.getweapon());
        players.damageByGun1();
       // palyer.damageByGun1();
       // players.heal();
        players.damageByGun1();
        players.damageByGun2();
        player2 player =new player2("Sam" ," GUN-M416" ,80,true);
       
        System.out.println("\nPlayer Name : "+player.getName()+" | Health :"+player.getHealth()+" | Weapon :"+player.getweapon());
        player.damageByGun1();
        player.damageByGun1();
        player.heal();
    
        }
}