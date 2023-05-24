package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_class")
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameClass;

    private int hpClass;

    private int mpClass;

    @OneToMany(mappedBy = "class", cascade = CascadeType.REMOVE)
    private List<Character> characters;

    @OneToMany(mappedBy = "class", cascade = CascadeType.REMOVE)
    private List<Skill> skills;

    private String descriptionClass;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getHpClass() {
        return hpClass;
    }

    public void setHpClass(int hpClass) {
        this.hpClass = hpClass;
    }

    public int getMpClass() {
        return mpClass;
    }

    public void setMpClass(int mpClass) {
        this.mpClass = mpClass;
    }

    public String getDescriptionClass() {
        return descriptionClass;
    }

    public void setDescriptionClass(String descriptionClass) {
        this.descriptionClass = descriptionClass;
    }
}
