package adekvat.singlepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import adekvat.singlepage.model.User;
import adekvat.singlepage.repository.UserRepository;

@SpringBootApplication
public class SinglepageApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SinglepageApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Peregrin", "Took", "foolofatook@gmail.com"));
		this.userRepository.save(new User("Gandalf", "the Gray", "graybeard@gmail.com"));
		this.userRepository.save(new User("Art", "Vandelay", "artvandelay@gmail.com"));
	}
}
