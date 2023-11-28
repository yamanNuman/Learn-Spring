package com.in28minutes.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<User>();
	
	private static int userCount = 0;
	
	static {
		users.add(new User(++userCount,"Steven",LocalDate.now().minusYears(30)));
		users.add(new User(++userCount,"Frank",LocalDate.now().minusYears(20)));
		users.add(new User(++userCount,"John",LocalDate.now().minusYears(23)));
		users.add(new User(++userCount,"Xabi",LocalDate.now().minusYears(36)));
		users.add(new User(++userCount,"Andreas",LocalDate.now().minusYears(41)));
	}

	public List<User> findAll(){	
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
}
