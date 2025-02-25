package com.wipro.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student") // Matches table name in DB
public class Employee {  // Consider renaming this to `Student`
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stid; // Matches DB column 'stid'

    @Column(name = "Stname") // Matches DB column 'Stname'
    private String stname;

    @Column(name = "Staddress") // Matches DB column 'address'
    private String staddress;

    public Employee() {}

    public Employee(String stname, String staddress) {
        this.stname = stname;
        this.staddress = staddress;
    }

    public Long getStid() { return stid; }
    public void setStid(Long stid) { this.stid = stid; }

    public String getStname() { return stname; }
    public void setStname(String stname) { this.stname = stname; }

    public String getStaddress() { return staddress; }
    public void setStaddress(String staddress) { this.staddress = staddress; }

    @Override
    public String toString() {
        return "Employee [stid=" + stid + ", stname=" + stname + ", staddress=" + staddress + "]";
    }
    
    
}
