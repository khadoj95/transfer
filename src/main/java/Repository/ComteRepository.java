package Repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import Entite.Compte;

@Repository
public interface ComteRepository extends JpaRepository<Compte, Integer>{

	@Modifying  @Transactional @Query(value="update Compte c set c.solde=c.solde+:y where c.num like :x " ,nativeQuery=true) 
	public void versser (@Param("x")Integer num ,@Param("y") long solde);
	@Modifying  @Transactional @Query(value=" update Compte c set c.solde=c.solde-:y where c.num like :x " ,nativeQuery=true) 
	public void retirer(@Param("x")Integer compte1,@Param("y")long solde);
	
	}
