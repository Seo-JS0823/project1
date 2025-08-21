package com.emp.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.submapper.AddressMapper;

@RestController
public class AddressController {

	@Autowired
	private AddressMapper addressMapper;
	
	@GetMapping("/address")
	public List<String> search(String search) {
		
		List<String> addressList = addressMapper.search(search);
		
		return addressList;
	}
}
