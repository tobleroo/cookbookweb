package spring.cookbookweb.ConfigAndUser;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {
    

    @Id
    @GeneratedValue
    private Long userId;
    
    @Column(unique = true)
    private String username;
    private String password;
    private String role;

    public User() {
    }
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public Long getId() {
        return userId;
    }
    public void setId(Long id) {
        this.userId = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User [id=" + userId + ", username=" + username + ", password=" + password + ", role=" + role + "]";
    }

    
}

/* 
 * 
 * @NamedEntityGraph(name = "graph.UserRecipies" ,attributeNodes = @NamedAttributeNode(value = "recipies"))
@NamedEntityGraph(
    name = "graph.UserRecipiesIngredientsAmountsWeights",
    attributeNodes = @NamedAttributeNode(value = "recipies", subgraph = "subgraph.recipe"),
    subgraphs = { 
        @NamedSubgraph(name = "subgraph.recipe", 
                attributeNodes = @NamedAttributeNode(value = "ingredients")),
        @NamedSubgraph(name = "subgraph.recipe", 
                attributeNodes = @NamedAttributeNode(value = "amount")),
        @NamedSubgraph(name = "subgraph.recipe",
                attributeNodes = @NamedAttributeNode(value = "weight")) })
 */