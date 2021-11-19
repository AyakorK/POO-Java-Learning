import com.CodingFactory.FightingGame.Characters;

public class Voleur {

    public double critical(double attack) {
        double Crits = (int) (Math.random() * 101);
        boolean Critical = false;
        if (Crits <= 10 && Critical == false) {
            System.out.println(Crits);
            health -= attack * 2;
            System.out.println("Thief inflicted critical damages");
            Critical = true;
        } else {
            System.out.println(Crits);
            health -= attack;
            Critical = false;
        }
        return attack;
    }

    class Thief extends Characters {

        public Thief(double health, double attack, double initiative, String name, String role, int shield, double magic) {
            super(health, attack, initiative, name, role, shield, magic);

        }
    }

    public boolean dodge(double attack) {
        int Dodges = (int) (Math.random() * 101);
        boolean Dodge = false;
        if (Dodges <= 10 && !Dodge) {
            System.out.println(Dodges);
            health -= attack * 0;
            System.out.println("Le coup a été esquivé !");
            Dodge = true;
        } else {
            System.out.println(Dodges);
            health -= attack;
            Dodge = false;
        }
        return Dodge;
    }



}

