package src.pojo;
// Generated Aug 8, 2016 11:10:30 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Item generated by hbm2java
 */
public class Item  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String descrption;
     private Set mappings = new HashSet(0);

    public Item() {
    }

    public Item(String name, String descrption, Set mappings) {
       this.name = name;
       this.descrption = descrption;
       this.mappings = mappings;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescrption() {
        return this.descrption;
    }
    
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
    public Set getMappings() {
        return this.mappings;
    }
    
    public void setMappings(Set mappings) {
        this.mappings = mappings;
    }




}


