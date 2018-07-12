package services;

import java.util.List;

import com.James.api.v1.model.CategoryDTO;

public interface CategoryService {

	List<CategoryDTO> getAllCategories();

	CategoryDTO getCategoryByName(String name);
}
