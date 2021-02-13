package Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import Entite.Client;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface ClientRepository extends JpaRepository<Client, Long>{

	public List<Client> findAll();
	public List<Client> findById(long id);
	public Page<Client> findById(long id,Pageable pageable);
	@Query("select e from Client e where e.username like :x ")
	public Page<Client> chercherClient(@Param("x")String usr,Pageable pageable);
}

