package com.example.jpa;

import com.example.jpa.model.Address;
import com.example.jpa.model.Name;
import com.example.jpa.model.User;
import com.example.jpa.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaEmbeddableDemoApplicationTests {
	@Autowired
	UserRepository userRepository;

	@Test
	public void testDIRepository( ){

		assertNotNull( userRepository );
	}

	/**
	* 应该尽量减少update的产生,方法是，先插入user,然后再插入其他的
	* @param
	* @return
	* @throws
	* @description :
	*/
	@Test
	public void testInsert( ){
		Address address = new Address("address lin1","address lin2","suzhou","0512","china","+81" );
		Name name = new Name("zhi","ho","bin");
		User user = new User();
		user.setId(1L);
		user.setEmail("zhihb@163.com");
		user.setAddress(address);
		user.setName(name);
		userRepository.save( user );
	}

	@Test
	public void contextLoads() {


	}

}
