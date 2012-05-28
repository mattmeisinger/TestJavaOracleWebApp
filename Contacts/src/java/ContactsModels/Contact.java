/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactsModels;

/**
 *
 * @author Matt
 */
public class Contact {
    private Long id;
    private String name;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "ContactsModels.Contact[ id=" + id + " ]";
    }
    
}
