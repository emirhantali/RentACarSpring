package springproject.rentACar.business.abstracts;

import java.util.List;

import springproject.rentACar.business.requests.CreateBrandRequest;
import springproject.rentACar.business.requests.UpdateBrandRequest;
import springproject.rentACar.business.responses.GetAllBrandsResponse;
import springproject.rentACar.business.responses.GetByIdBrandResponse;

public interface BrandService {

	List<GetAllBrandsResponse> getAll();
	
	GetByIdBrandResponse getById(int id);
	
	void add(CreateBrandRequest createBrandRequest);
	
	void update(UpdateBrandRequest updateBrandRequest);
	
	void delete(int id);
	
	
	
	
	
	
}
