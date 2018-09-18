import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.iLoginService;
import com.example.demo.service.ILoginService;
import com.example.demo.model.Klant;
import com.example.demo.model.Login; 

public class LoginController {
	

	@Autowired
	private ILoginService iLoginService;

	@GetMapping("/api/login/{id}")
	public Login findById(@PathVariable Long id) {
		Optional<Login> optional = this.iLoginService.findOne(id);

		if (optional.isPresent())
			return optional.get();

		return null;
	}

	@GetMapping("/api/login/all")
	public List<Login> findAll() {
		return this.iLoginService.findAll();
	}

	@PostMapping("/api/login")
	public Login create(@RequestBody Login login) {
		return this.iLoginService.create(login);
	}

	@PutMapping("/api/login/{id}")
	public boolean update(@PathVariable Long id, @RequestBody Login login) {
		this.iLoginService.update(login);

		return true;
	}

	@DeleteMapping("/api/login/{id}")
	public boolean delete(@PathVariable Long id) {
		Optional<Login> optional = this.iLoginService.findOne(id);
		if (optional.isPresent()) {
			this.iLoginService.delete(optional.get());

			return true;
		}

		return false;
	}


	
	
	

}
