package com.fabianoapp.confectionery.services;

import javax.persistence.EntityNotFoundException;

import com.fabianoapp.confectionery.dto.CategoryDTO;
import com.fabianoapp.confectionery.dto.ProductDTO;
import com.fabianoapp.confectionery.dto.ProductMinDTO;
import com.fabianoapp.confectionery.entities.Category;
import com.fabianoapp.confectionery.entities.Product;
import com.fabianoapp.confectionery.entities.enums.ProductType;
import com.fabianoapp.confectionery.repositories.ProductRepository;
import com.fabianoapp.confectionery.services.exceptions.DatabaseException;
import com.fabianoapp.confectionery.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new ProductDTO(product);
    }

    @Transactional(readOnly = true)
    public Page<ProductMinDTO> findAll(String name, ProductType productType, Pageable pageable) {
        Page<Product> result = repository.searchByName(name, productType, pageable);
        return result.map(x -> new ProductMinDTO(x));
    }

    @Transactional
    public ProductDTO insert(ProductDTO dto) {
        Product entity = new Product();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new ProductDTO(entity);
    }

    @Transactional
    public ProductDTO update(Long id, ProductDTO dto) {
        try {
            Product entity = repository.getReferenceById(id);
            copyDtoToEntity(dto, entity);
            entity = repository.save(entity);
            return new ProductDTO(entity);
        }
        catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Recurso não encontrado");
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id) {
        try {
            repository.deleteById(id);
        }
        catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Recurso não encontrado");
        }
        catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Falha de integridade referencial");
        }
    }

    private void copyDtoToEntity(ProductDTO dto, Product entity) {
        entity.setName(dto.getName());
        entity.setImgUrl(dto.getImgUrl());
        entity.setStockQuantity(dto.getStockQuantity());
        entity.setPackageQuantity(dto.getPackageQuantity());
        entity.setMeasurementUnit(dto.getMeasurementUnit());
        entity.setPrice(dto.getPrice());
        entity.setProductType(dto.getProductType());

        entity.getCategories().clear();
        for (CategoryDTO catDto : dto.getCategories()) {
        	Category cat = new Category();
        	cat.setId(catDto.getId());
        	entity.getCategories().add(cat);
        }
    }
}
