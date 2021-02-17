package Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Entite.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

@Query("select e from Client e where e.id=:x")
public Client getOner(@Param("x")Integer id);
@Query("select e from Client e where e.nom=:x")
public Client getOnes(@Param("x")String nom);
}

