package Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_race")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String raceName;

    private int raceHp;

    private int raceMp;

    private String raceDescription;

    @OneToMany(mappedBy = "race", cascade = CascadeType.REMOVE)
    private List<Character> characters;

    @OneToMany(mappedBy = "race", cascade = CascadeType.REMOVE)
    private List<Skill> skills;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public int getRaceHp() {
        return raceHp;
    }

    public void setRaceHp(int raceHp) {
        this.raceHp = raceHp;
    }

    public int getRaceMp() {
        return raceMp;
    }

    public void setRaceMp(int raceMp) {
        this.raceMp = raceMp;
    }

    public String getRaceDescription() {
        return raceDescription;
    }

    public void setRaceDescription(String raceDescription) {
        this.raceDescription = raceDescription;
    }
}
