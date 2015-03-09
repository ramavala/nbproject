/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ram.java.domain;

/**
 *
 * @author Admin
 */
public class UserAdd 
{
    private String Name;
    private  int Age;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    
}
