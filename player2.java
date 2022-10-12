import javax.swing.JOptionPane;

public class player2  extends player1{

private int health;
private boolean armour;
    
public player2(String name , String weapon, int health ,boolean armour){
    super( name, weapon,health);
    this.health = health;
    this.armour = armour;
  }

@Override
public void damageByGun1(){
    if( armour){
        this.health -=20;
        if(this.health <= 0)
        this.health=0;
        System.out.print("\n");
        System.out.print("Armour is on .Got hit by gun 1.Health is reduced by 20." + "New health is "  + this.health);

    }
    if(!armour){
        this.health -=30;
        if(this.health <= 0)
        this.health=0;
        System.out.print("\n");
        System.out.print("Armour is off .Got hit by gun 1.Health is reduced by 30." + "New health is "  + this.health);

    }
    if(this.health == 0){
        System.out.print(getName()+" is dead");
        JOptionPane.showMessageDialog(null,this.getName()+"Player is Dead");
    }

    }
@Override
public void damageByGun2(){
    if( armour){
        this.health -=40;
        if(this.health <= 0)
        this.health=0;
        System.out.print("Armour is on .Got hit by gun 2.Health is reduced by 40." + "New health is "  + this.health);

    }
    if(!armour){
        this.health -=50;
        if(this.health <= 0)
        this.health=0;
        System.out.print("Armour is off.Got hit by gun 2.Health is reduced by 50." + "New health is "  + this.health);

    }
    if(this.health == 0){
        System.out.print(getName()+" is dead");
        JOptionPane.showMessageDialog(null,this.getName()+"Player is Dead");
    }

}
}

