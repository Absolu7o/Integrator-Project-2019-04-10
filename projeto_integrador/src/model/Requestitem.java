package model;
// Generated 24/04/2019 22:28:50 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Requestitem generated by hbm2java
 */
@Entity
@Table(name="requestitem"
    ,schema="sis_comanda"
)
public class Requestitem  implements java.io.Serializable {


     private int code;
     private Item item;
     private Request request;
     private String status;
     private Integer countitem;
     private String note;
     private Character checkRequeststart;
     private Date datetimeins;
     private Date datetimeupd;
     private Set<Requestadditionalitem> requestadditionalitems = new HashSet<Requestadditionalitem>(0);

    public Requestitem() {
    }

	
    public Requestitem(int code) {
        this.code = code;
    }
    public Requestitem(int code, Item item, Request request, String status, Integer countitem, String note, Character checkRequeststart, Date datetimeins, Date datetimeupd, Set<Requestadditionalitem> requestadditionalitems) {
       this.code = code;
       this.item = item;
       this.request = request;
       this.status = status;
       this.countitem = countitem;
       this.note = note;
       this.checkRequeststart = checkRequeststart;
       this.datetimeins = datetimeins;
       this.datetimeupd = datetimeupd;
       this.requestadditionalitems = requestadditionalitems;
    }
   
     @Id 

    
    @Column(name="code", unique=true, nullable=false)
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="code_item")
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="code_request")
    public Request getRequest() {
        return this.request;
    }
    
    public void setRequest(Request request) {
        this.request = request;
    }

    
    @Column(name="status", length=20)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="countitem")
    public Integer getCountitem() {
        return this.countitem;
    }
    
    public void setCountitem(Integer countitem) {
        this.countitem = countitem;
    }

    
    @Column(name="note", length=150)
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    
    @Column(name="check_requeststart", length=1)
    public Character getCheckRequeststart() {
        return this.checkRequeststart;
    }
    
    public void setCheckRequeststart(Character checkRequeststart) {
        this.checkRequeststart = checkRequeststart;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="datetimeins", length=29)
    public Date getDatetimeins() {
        return this.datetimeins;
    }
    
    public void setDatetimeins(Date datetimeins) {
        this.datetimeins = datetimeins;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="datetimeupd", length=29)
    public Date getDatetimeupd() {
        return this.datetimeupd;
    }
    
    public void setDatetimeupd(Date datetimeupd) {
        this.datetimeupd = datetimeupd;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="requestitem")
    public Set<Requestadditionalitem> getRequestadditionalitems() {
        return this.requestadditionalitems;
    }
    
    public void setRequestadditionalitems(Set<Requestadditionalitem> requestadditionalitems) {
        this.requestadditionalitems = requestadditionalitems;
    }




}

