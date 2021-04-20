package acme.features.manager.userAccount;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.entities.UserAccount;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface ManagerUserAccountRepository extends AbstractRepository{
	
	@Query("select ua from UserAccount ua where ua.id = ?1")
	UserAccount findOneUserAccountById(int id);
	
	@Query("select ua from UserAccount ua")
	Collection<UserAccount> findAllUserAccounts();

}
