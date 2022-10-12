import javax.swing.JOptionPane;

public class player1 {
     private String name;
     private  String weapon ;
     private int health;
     public player1(String name , String weapon, int health){
        this.name= name;
        this.weapon = weapon;
        this.health = health;

     }
     public void damageByGun1(){
      this.health-=30;
      if(this.health <=0){
          this.health =0;
      }
      System.out.print("\n");
      System.out.print("Got hit by gun 1.\nHealth is reduced by 30 \n" +" New health  "+this.getHealth());
      if (this.health ==0){
          System.out.println("Player is dead"); 
          JOptionPane.showMessageDialog(null,this.getName()+"Player is Dead");
      }
   }
     
 public void damageByGun2(){
    this.health -=50;
    if(this.health <=0){
        this.health =0;
    }
    System.out.print("\n");
    System.out.print("Got hit by gun 2.Health is reduced by 30" +" New health  "  +this.getHealth());
    if (this.health ==0){
        System.out.println("Player is dead");
        JOptionPane.showMessageDialog(null,this.getName()+"Player is Dead");
    }
 }
 public void heal(){
    if (this.health <=0){
        System.out.println("Player is dead .Heal not possible");
      }  else {
        this.health = 100;
        System.out.println("Health is \n" + this.health);
    }
 }
 public String getName(){
    return name;
 }
 public void setName(String name){
    this.name=name;
 }
 public String getweapon(){
    return weapon;
 }
 public void setWeapon(String weapon){
    this.weapon = weapon;
 }
 public int getHealth(){
    return this.health;
 }
 public void setHealth(int health){
    this.health= health;
 }
}
