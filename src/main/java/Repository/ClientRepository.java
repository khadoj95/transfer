package Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entite.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

	
}

