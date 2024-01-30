package springproject.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import springproject.rentACar.business.abstracts.ModelService;
import springproject.rentACar.business.requests.CreateModelRequest;
import springproject.rentACar.business.responses.GetAllModelsResponse;
import springproject.rentACar.core.utilities.mappers.ModelMapperService;
import springproject.rentACar.dataAccess.abstracts.ModelRepository;
import springproject.rentACar.entities.concretes.Model;

@Service
@AllArgsConstructor
public class ModalManager implements ModelService{

	private ModelRepository modelRepository;
	private ModelMapperService modelMapperService;
	
	
	
	@Override
	public List<GetAllModelsResponse> getAll() {
	
		List<Model> models = modelRepository.findAll();

		List<GetAllModelsResponse> modelsResponse = models.stream()
				.map(model -> this.modelMapperService.forResponse().map(model, GetAllModelsResponse.class))
				.collect(Collectors.toList());

		return modelsResponse;
		
		
		
		
		
	}



	@Override
	public void add(CreateModelRequest createModelRequest) {

		Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);

		this.modelRepository.save(model);
		
	}

	
	
	
}
