package Service;
import java.util.Optional;
	import java.util.ArrayList;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import Entite.Client;
	import Repository.ClientRepository;
	//defining the business logic
	@Service
public class ClientService {
	
	
		@Autowired
	   private ClientRepository clientRepository;
		public List<Client> getall(){
			return (List<Client>) clientRepository.findAll();
		}
	 public Optional<Client> getOne(Integer id) {
		 return clientRepository.findById(id);
	 }
	 
	 public void ajoute(Client c) {
		 clientRepository.save(c);
	 }
	 public void sup(Integer id) {
	 	clientRepository.deleteById(id);
	 }
	 // public List<Client> getalc() {
	 //     return clientrepository.findAll();
	 // }

	 // public void saveCustomer(Client client) {
	 //  	clientrepository.save(client);
	 //  }

	   // public Client getCustomer(long id) {
	   //     return clientrepository.findById(id).get();
	    //}

	
}
