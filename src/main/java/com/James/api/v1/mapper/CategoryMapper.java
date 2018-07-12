package com.James.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.James.api.v1.model.CategoryDTO;
import com.James.domain.Category;

@Mapper
public interface CategoryMapper {

	CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

	CategoryDTO categoryToCategoryDTO(Category category);
}
