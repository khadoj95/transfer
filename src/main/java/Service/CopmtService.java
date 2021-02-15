package Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entite.Compte;
import Repository.ComteRepository;
@Service
public class CopmtService {

	@Autowired
   private ComteRepository comptRepository;
	public List<Compte> getal(){
		return (List<Compte>) comptRepository.findAll();
	}
	public Optional<Compte> getOn(Integer id) {
		 return comptRepository.findById(id);
	 }
	 public void supp(Integer id) {
		 comptRepository.deleteById(id);
		 }
}
