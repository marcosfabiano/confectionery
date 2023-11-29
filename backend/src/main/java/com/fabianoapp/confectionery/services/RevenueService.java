package com.fabianoapp.confectionery.services;

import com.fabianoapp.confectionery.dto.*;
import com.fabianoapp.confectionery.entities.*;
import com.fabianoapp.confectionery.repositories.*;
import com.fabianoapp.confectionery.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RevenueService {

    @Autowired
    private RevenueRepository repository;
    
    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private RevenueItemRepository revenueItemRepository;
    
    @Transactional(readOnly = true)
    public RevenueDTO findById(Long id) {
        Revenue revenue = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new RevenueDTO(revenue);
    }

    @Transactional(readOnly = true)
    public Page<RevenueMinDTO> findAll(String name, Pageable pageable) {
        Page<Revenue> result = repository.searchByName(name, pageable);
        return result.map(x -> new RevenueMinDTO(x));
    }

    @Transactional
	public RevenueDTO insert(RevenueDTO dto) {
    	Revenue revenue = new Revenue();
        revenue.setName(dto.getName());
        revenue.setPreparation(dto.getPreparation());
    	for (RevenueItemDTO itemDto : dto.getItems()) {
    		Product product = productRepository.getReferenceById(itemDto.getProductId());
    		RevenueItem item = new RevenueItem(revenue, product, itemDto.getQuantity());
    		revenue.getItems().add(item);
    	}
    	repository.save(revenue);
    	revenueItemRepository.saveAll(revenue.getItems());
    	return new RevenueDTO(revenue);
	}
}
