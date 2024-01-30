package springproject.rentACar.business.rules;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import springproject.rentACar.core.utilities.exceptions.BusinessException;
import springproject.rentACar.dataAccess.abstracts.BrandRepository;




@AllArgsConstructor
@Service
public class BrandBusinessRules {

	private BrandRepository brandRepository;
	
	public void checkIfBrandNameExists(String name) {
		
		if (this.brandRepository.existsByName(name)) {
			
			throw new BusinessException("Brand Name Already Exists");
			
			
		}
		
		
		
	}
	
	
	
}
