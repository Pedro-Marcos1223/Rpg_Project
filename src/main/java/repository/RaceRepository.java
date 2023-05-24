package repository;

import Model.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {

    public List<Race> findAllByRaceNameContainingIgnoreCase(String raceName);
}
