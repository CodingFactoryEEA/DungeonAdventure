import java.util.ArrayList;
import java.util.*;

/**
 *
 */
public class Hero extends Character {
    private int m_iStrength;
    private ReduceLifePower m_Power;

    private List<HeroWeapons> m_Arsenal ;

    public Hero() {
        this.m_Arsenal = new ArrayList();
        this.m_Arsenal.add(new Sword());
        this.m_Arsenal.add(new Arrow());
        this.m_Arsenal.add(new WaterFlask());
        this.m_Arsenal.add(new Spear());
        this.m_Arsenal.add(new FireArrow());
    }

    public Hero(int m_iStrength) {
        super();
        this.m_iStrength = m_iStrength;

    }

    /**
     * cette méthode permet de selectionné l'arme sélectionnée par l'utilisateur
     * @param p_sWeaponClassName
     */
    private void selectWeaponFromArsenal(String p_sWeaponClassName) {
        m_Arsenal.forEach(weapon -> {
            if (weapon.getClass().getName().equals(p_sWeaponClassName)) {
                super.m_Weapon = weapon;
            };
        });
    }

    /**
     *
     * @param p_TargetCharacter
     */
    @Override
    public void attack(Character p_TargetCharacter) {

        //TODO Mettre un try catch ou un check ou trouver une autre façon ou endroit où appeler la fonction
        Monster monster = (Monster)p_TargetCharacter;
        if(monster.isWeaponEfficient(this.m_Weapon)){
            //TODO Mettre un try catch ou un check ou trouver une autre façon ou endroit où appeler la fonction
            HeroWeapons heroWeapon = (HeroWeapons)this.m_Weapon;
            //TODO Implémenter la logique de bonus d'attaque
            heroWeapon.setAttackBonus(2);

        }
        super.attack(p_TargetCharacter);

        if (//this.arme
        null == null) {
            //int degats = this.arme.getAttaque();
            if (
                    //utiliserWaterFlask
            true) {
                // Utilisation de la flasque d'eau : bonus de dégâts
                //degats += 2;
            }
            System.out.println(
                    //this.getNom() + " attaque " + p_TargetCharacter.getNom() + " avec " + this.arme.getNom() + " et inflige " + degats + " points de dégâts."
                    );

            if (//attaquerAvecSword && this.arme instanceof Sword
            true ) {
                // Attaque avec l'épée : vérification de la chance de toucher la tête du barbare
                double chanceDeToucherTete = 0.10; // 10% de chance de toucher la tête
                double randomValue = Math.random(); // Générer une valeur aléatoire entre 0 et 1

                if (randomValue <= chanceDeToucherTete) {
                   // System.out.println(this.getNom() + " touche la tête du barbare et l'empêche d'attaquer au prochain tour.");
                    //((Barbarian)p_TargetCharacter).setParalyse(true); // Marquer le barbare comme paralysé
                }
            }

           // p_TargetCharacter.subirDegats(degats);
        } else {
            //System.out.println(this.getNom() + " ne peut pas attaquer car il n'a pas d'arme équipée.");
        }
    }


    public void discoverEnnemy(Monster p_Monster) {
        //TODO minor : Check values & set try catch
        System.out.println("L'arme efficace contre l'ennemie est " + p_Monster.getEffectiveWeaponType() +
                " entrez le sans erreur pour le moment svp x'D");
        boolean isOk = true;
        while(isOk){
            Scanner scanner = new Scanner(System.in);
            if(scanner.next() == p_Monster.getEffectiveWeaponType()){
                selectWeaponFromArsenal(p_Monster.getEffectiveWeaponType());
                isOk = false;
            }
            else {
                System.out.println("erreur d'entrée, veuillez entrer :" + p_Monster.getEffectiveWeaponType() +
                        " entrez le sans erreur pour le moment svp x'D");
            }
        }
                     /*   // Liste des monstres disponibles dans le jeu
                        Monster[] availableMonsters = {
                                new Magicien("Magicien", 50, new Eclairs(5)),
                                new Barbare("Barbare", 80, new Hache())

                        };

                        // Générez un indice aléatoire pour sélectionner un monstre parmi les monstres disponibles
                        Random random = new Random();
                        int randomIndex = random.nextInt(availableMonsters.length);

                        Monster discoveredMonster = availableMonsters[randomIndex];
                        System.out.println("Le héros a découvert un " + discoveredMonster.getNom() + " !");
                        // Vous pouvez maintenant gérer le combat entre le héros et le monstre

                      */

//        // Créez un générateur aléatoire
//        Random random = new Random();
//
//        // Générez un nombre aléatoire pour déterminer le type de monstre
//        int randomMonsterType = random.nextInt(100);
//
//        // Par exemple, s'il y a 70% de chance de rencontrer un magicien
//        if (randomMonsterType < 70) {
//            // Créez un Magicien
//            int SorcererChanceParalysie = 10; // 10% de chance de paralyser le héros
//            int SorcererDegatsEclair = 20; // Dégâts de l'éclair
//            return new Sorcerer();
//        } else {
//            // Sinon, créez un Barbare
//            int barbarianChanceCoupCritique = 30; // 30% de chance de coup critique
//            int barbarianDegatsHache = 30; // Dégâts de la hache
//            return new Barbarian();
//        }


    }

    public void setStrength(int p_iStrength) {
        this.m_iStrength = p_iStrength;
    }

    public void improveHealth(int p_iValue) {
        if (p_iValue > 0) {
            this.m_iLifePoints += p_iValue; // Augmenter la santé du héros de la valeur spécifiée
            System.out.println("La potion : " +HealthPotion.class.getClass().getName() + " améliore votre santé de " + p_iValue + " points.");
            System.out.println("Vos points de santé actuels sont de " +this.m_iLifePoints+ " + points De Vie");
        } else {
            System.out.println("La valeur de l'amélioration de la santé doit être positive.");
        }
    }


    public void improveStrength(int p_iValue) {
        if (p_iValue > 0) {
            this.m_iStrength += p_iValue; // Augmenter la force du héros de la valeur spécifiée
            System.out.println("La potion : " +StrengthPotion.class.getClass().getName() + " améliore votre force de " + p_iValue + " points.");
            System.out.println("Vos points de force actuels sont de " +this.m_iStrength+ " + points de force");
        } else {
            System.out.println("La valeur de l'amélioration de la force doit être positive.");
        }
    }

    public void searchForPotions(Searchable p_Searchable) {
//        int potionsTrouvees = p_Searchable.searchPotions(); // Appeler la méthode searchPotions() de l'objet Searchable
//
//        if (potionsTrouvees > 0) {
//            System.out.println(this.getNom() + " a trouvé " + potionsTrouvees + " potion(s) de santé.");
//            this.improveHealth(potionsTrouvees * 10); // Par exemple, chaque potion restaure 10 points de santé
//        } else {
//            System.out.println(this.getNom() + " n'a trouvé aucune potion de santé dans cet objet Searchable.");
//        }
    }
}