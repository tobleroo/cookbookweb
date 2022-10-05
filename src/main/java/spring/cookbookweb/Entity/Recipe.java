package spring.cookbookweb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipes")
public class Recipe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recipeId;
    
    private String recipeName;
    private String description;
    private int cookTime;
    private String difficulty;
    private String mealType;


    public Recipe (){}

    public Recipe (String name,String desc, int time, String diff, String meal){
        this.recipeName = name;
        this.description = desc;
        this.cookTime = time;
        this.difficulty = diff;
        this.mealType = meal;
    }
    
    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public long getId() {
        return recipeId;
    }
    public void setId(long id) {
        this.recipeId = id;
    }
    public String getRecipeName() {
        return recipeName;
    }
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (recipeId ^ (recipeId >>> 32));
        result = prime * result + ((recipeName == null) ? 0 : recipeName.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + cookTime;
        result = prime * result + ((difficulty == null) ? 0 : difficulty.hashCode());
        result = prime * result + ((mealType == null) ? 0 : mealType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Recipe other = (Recipe) obj;
        if (recipeId != other.recipeId)
            return false;
        if (recipeName == null) {
            if (other.recipeName != null)
                return false;
        } else if (!recipeName.equals(other.recipeName))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (cookTime != other.cookTime)
            return false;
        if (difficulty == null) {
            if (other.difficulty != null)
                return false;
        } else if (!difficulty.equals(other.difficulty))
            return false;
        if (mealType == null) {
            if (other.mealType != null)
                return false;
        } else if (!mealType.equals(other.mealType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Recipe [id=" + recipeId + ", recipeName=" + recipeName + ", description=" + description + ", cookTime="
                + cookTime + ", difficulty=" + difficulty + ", mealType=" + mealType + "]";
    }

}
