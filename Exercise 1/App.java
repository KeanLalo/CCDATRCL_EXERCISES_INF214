public class App {
    public static void main(String[] args) {
        //Character Class
        Character assasin = new Character();
        assasin.strength = 5;
        assasin.agility = 10;
        assasin.intelligence = 10;
        assasin.name = "Ekko";
        assasin.sayMyName();
        assasin.sayMyStrength();
        assasin.sayMyAgility();
        assasin.sayMyIntelligence();

        Character marksman = new Character();
        marksman.strength = 3;
        marksman.agility = 6;
        marksman.intelligence = 5;
        marksman.name = "Lucian";
        marksman.sayMyName();
        marksman.sayMyStrength();
        marksman.sayMyAgility();
        marksman.sayMyIntelligence();


        Character tank = new Character();
        tank.strength = 10;
        tank.agility = 4;
        tank.intelligence = 3;
        tank.name = "Garen";
        tank.sayMyName();
        tank.sayMyStrength();
        tank.sayMyAgility();
        tank.sayMyIntelligence();

        Character support = new Character();
        support.strength = 8;
        support.agility = 9;
        support.intelligence = 7;
        support.name = "Nautilus";
        support.sayMyName();
        support.sayMyStrength();
        support.sayMyAgility();
        support.sayMyIntelligence();
        
        //Enemy class
        Enemy boss = new Enemy();

        boss.damage = 1000;
        boss.health = 1000;
        boss.armor = 500;
        boss.hasMagicImmunity = true;
        boss.name = "Thanos";
        boss.enemyDialogue();

        Enemy goblin = new Enemy();

        goblin.damage = 500;
        goblin.health = 300;
        goblin.armor = 200;
        goblin.hasMagicImmunity = false;
        goblin.name = "Green Goblin";
        goblin.enemyDialogue();

        Enemy symbiote = new Enemy();

        symbiote.damage = 1000;
        symbiote.health = 500;
        symbiote.armor = 300;
        symbiote.hasMagicImmunity = false;
        symbiote.name = "Venom";
        symbiote.enemyDialogue();

        Weapon infinitygauntlet = new Weapon("Infinity Gauntlet", 1000, 500, "Legendary", "Powerful to destroy all living creatures.");

        infinitygauntlet.displayName();
        infinitygauntlet.displayDamage();
        infinitygauntlet.displayWeight();
        infinitygauntlet.displayRarity();
        infinitygauntlet.displayWeaponDescription();

        Weapon bomb = new Weapon("Pumpkin Bomb", 500, 2, "Rare", "A bomb powerful enough to destroy Spiderman.");

        bomb.displayName();
        bomb.displayDamage();
        bomb.displayWeight();
        bomb.displayRarity();
        bomb.displayWeaponDescription();

        Weapon black = new Weapon("Symbiote", 1000, 0, "Epic", "A black suited figure suit that matches the power of Spiderman.");

        black.displayName();
        black.displayDamage();
        black.displayWeight();
        black.displayRarity();
        black.displayWeaponDescription();

    }
}
