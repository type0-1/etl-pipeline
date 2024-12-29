package net.etlpipeline.springboot_app.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

// Defining entity

@Entity
public class UserData{
    
    // Auto generate ID for each user

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    
    /**
     * nullable determines whether a field should be allowed to be undefined
     * unique determines whether a field should only contain unique entries.
     */

    @Column(nullable=false)
    @NotNull
    @Size(min=2, max=100)
    private String name;
    
    @Min(0)
    @Max(120)
    private int age;

    private boolean married;

    @Column(nullable=false)
    @NotNull
    @Size(min=10,max=100)
    private String address;

    @Column(unique=true, nullable=false)
    @NotNull
    private String mobileNo;

    // Constructors for JPA entity.
    public UserData(){}

    public UserData(String name, int age, boolean married, String address, String mobileNo){
        this.name = name;
        this.age = age;
        this.married = married;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    // Getters & Setters
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean getMarried(){
        return this.married;
    }

    public void setMarried(boolean married){
        this.married = married;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getMobileNo(){
        return this.mobileNo;
    }

    public void setMobileNo(String mobileNo){
        this.mobileNo = mobileNo;
    }

    // toString UserData return message
    @Override
    public String toString(){
        return "User Data:\nid: " + this.id + "\nname: " + this.name + "\nage: " + this.age + "\nmarried: " + this.married + "\naddress: " + this.address + "\nmobile: " + this.mobileNo; 
    }

    // To check if user objects are the same (for storing UserData objects in hashing data structures)

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        else if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        UserData user_obj = (UserData) obj;
        return this.id != null && this.id.equals(user_obj.id);
    }

    // Generate hash code for unique user (ensuring correct object comparison and for serialisation)
    @Override
    public int hashCode(){
        return id != null ? this.id.hashCode() : 0;
    }
}