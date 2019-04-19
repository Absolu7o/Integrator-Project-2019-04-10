package model;
// Generated 14/04/2019 16:40:27 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Item generated by hbm2java
 */
public class Item  implements java.io.Serializable {


     private int code;
     private Category category;
     private String description;
     private BigDecimal price;
     private String preparation;
     private String additional;
     private String active;
     private Set additionalitems = new HashSet(0);
     private Set requestitems = new HashSet(0);
     private Set comboitemsForCodeItem = new HashSet(0);
     private Set comboitemsForCodeComboitem = new HashSet(0);

    public Item() {
    }

	
    public Item(int code) {
        this.code = code;
    }
    public Item(int code, Category category, String description, BigDecimal price, String preparation, String additional, String active, Set additionalitems, Set requestitems, Set comboitemsForCodeItem, Set comboitemsForCodeComboitem) {
       this.code = code;
       this.category = category;
       this.description = description;
       this.price = price;
       this.preparation = preparation;
       this.additional = additional;
       this.active = active;
       this.additionalitems = additionalitems;
       this.requestitems = requestitems;
       this.comboitemsForCodeItem = comboitemsForCodeItem;
       this.comboitemsForCodeComboitem = comboitemsForCodeComboitem;
    }
   
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getPrice() {
        return this.price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getPreparation() {
        return this.preparation;
    }
    
    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }
    public String getAdditional() {
        return this.additional;
    }
    
    public void setAdditional(String additional) {
        this.additional = additional;
    }
    public String getActive() {
        return this.active;
    }
    
    public void setActive(String active) {
        this.active = active;
    }
    public Set getAdditionalitems() {
        return this.additionalitems;
    }
    
    public void setAdditionalitems(Set additionalitems) {
        this.additionalitems = additionalitems;
    }
    public Set getRequestitems() {
        return this.requestitems;
    }
    
    public void setRequestitems(Set requestitems) {
        this.requestitems = requestitems;
    }
    public Set getComboitemsForCodeItem() {
        return this.comboitemsForCodeItem;
    }
    
    public void setComboitemsForCodeItem(Set comboitemsForCodeItem) {
        this.comboitemsForCodeItem = comboitemsForCodeItem;
    }
    public Set getComboitemsForCodeComboitem() {
        return this.comboitemsForCodeComboitem;
    }
    
    public void setComboitemsForCodeComboitem(Set comboitemsForCodeComboitem) {
        this.comboitemsForCodeComboitem = comboitemsForCodeComboitem;
    }




}

