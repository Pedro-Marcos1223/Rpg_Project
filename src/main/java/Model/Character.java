package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import org.springframework.context.annotation.ComponentScan;

@Entity
@Table(name = "tb_character")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull
    private String characterName;

    private String originLocale;

    private int height;

    private double weight;
    private int age;

    @Nonnull
    private int characterHp;

    @Nonnull
    private int characterMp;

    @ManyToOne
    @JsonIgnoreProperties("character")
    private User user;

    @ManyToOne
    @JsonIgnoreProperties("character")
    private Class classRelationship;

    @ManyToOne
    @JsonIgnoreProperties("character")
    private Race race;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getOriginLocale() {
        return originLocale;
    }

    public void setOriginLocale(String originLocale) {
        this.originLocale = originLocale;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCharacterHp() {
        return characterHp;
    }

    public void setCharacterHp(int characterHp) {
        this.characterHp = characterHp;
    }

    public int getCharacterMp() {
        return characterMp;
    }

    public void setCharacterMp(int characterMp) {
        this.characterMp = characterMp;
    }
}
