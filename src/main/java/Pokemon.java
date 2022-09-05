public class Pokemon {

    String name;
    int level;

    Pokemon(){
        level = 1;
    }
    Pokemon(String Name, int Level){
        this.name = Name;
        this.level = Level;
        this.attack();
    }

   // Pokemon(String name, int level){
     //   this.name = name;
       // this.level = level;
        //this.attack();



   void attack() {
       System.out.println(name + " ATTACK!");
   }



}