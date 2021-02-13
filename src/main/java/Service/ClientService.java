package Service;

	import java.util.ArrayList;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import Entite.Client;
	import Repository.ClientRepository;
	//defining the business logic
	
public class ClientService implements SER{
		@Autowired
	    private ClientRepository clientrepository;
		@Autowired
	    public List<Client> getalc() {
	        return clientrepository.findAll();
	    }

	    public void saveCustomer(Client client) {
	    	clientrepository.save(client);
	    }

	   // public Client getCustomer(long id) {
	   //     return clientrepository.findById(id).get();
	    //}

	    public void deleteCustomer(long id) {
	    	clientrepository.deleteById(id);
	    }
}
