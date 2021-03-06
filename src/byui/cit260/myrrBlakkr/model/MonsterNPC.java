/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Family
 */
public class MonsterNPC implements Serializable {
    
    // class instance variables
    private String type;
    private String attackStyle;
    private int healthPoints;
    private int attackRating;
    private int defenseRating;
    
    // default constructor method
    public MonsterNPC() {
    }
    
    
    // getter() and setter() methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttackStyle() {
        return attackStyle;
    }

    public void setAttackStyle(String attackStyle) {
        this.attackStyle = attackStyle;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackRating() {
        return attackRating;
    }

    public void setAttackRating(int attackRating) {
        this.attackRating = attackRating;
    }

    public int getDefenseRating() {
        return defenseRating;
    }

    public void setDefenseRating(int defenseRating) {
        this.defenseRating = defenseRating;
    }

    @Override
    public String toString() {
        return "MonsterNPC{" + "type=" + type + ", attackStyle=" + attackStyle + ", healthPoints=" + healthPoints + ", attackRating=" + attackRating + ", defenseRating=" + defenseRating + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.type);
        hash = 73 * hash + Objects.hashCode(this.attackStyle);
        hash = 73 * hash + this.healthPoints;
        hash = 73 * hash + this.attackRating;
        hash = 73 * hash + this.defenseRating;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MonsterNPC other = (MonsterNPC) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.attackStyle, other.attackStyle)) {
            return false;
        }
        if (this.healthPoints != other.healthPoints) {
            return false;
        }
        if (this.attackRating != other.attackRating) {
            return false;
        }
        if (this.defenseRating != other.defenseRating) {
            return false;
        }
        return true;
    }
        
    
}
