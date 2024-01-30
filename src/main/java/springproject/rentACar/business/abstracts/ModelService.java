package springproject.rentACar.business.abstracts;

import java.util.List;

import springproject.rentACar.business.requests.CreateModelRequest;
import springproject.rentACar.business.responses.GetAllModelsResponse;

public interface ModelService {

	List<GetAllModelsResponse> getAll();
	
	void add(CreateModelRequest createModelRequest);
	
	
	
	
	
	
	
	
}
