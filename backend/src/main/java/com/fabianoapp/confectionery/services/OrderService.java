package com.fabianoapp.confectionery.services;

import java.time.Instant;

import com.fabianoapp.confectionery.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fabianoapp.confectionery.dto.OrderDTO;
import com.fabianoapp.confectionery.dto.OrderItemDTO;
import com.fabianoapp.confectionery.entities.Order;
import com.fabianoapp.confectionery.entities.OrderItem;
import com.fabianoapp.confectionery.entities.OrderStatus;
import com.fabianoapp.confectionery.entities.Product;
import com.fabianoapp.confectionery.entities.User;
import com.fabianoapp.confectionery.repositories.OrderItemRepository;
import com.fabianoapp.confectionery.repositories.OrderRepository;
import com.fabianoapp.confectionery.repositories.ProductRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;
    
    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private OrderItemRepository orderItemRepository;
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        authService.validateSelfOrAdmin(order.getClient().getId());
        return new OrderDTO(order);
    }

    @Transactional
	public OrderDTO insert(OrderDTO dto) {
		
    	Order order = new Order();
    	
    	order.setMoment(Instant.now());
    	order.setStatus(OrderStatus.WAITING_PAYMENT);
    	
    	User user = userService.authenticated();
    	order.setClient(user);
    	
    	for (OrderItemDTO itemDto : dto.getItems()) {
    		Product product = productRepository.getReferenceById(itemDto.getProductId());
    		OrderItem item = new OrderItem(order, product, itemDto.getQuantity(), product.getPrice());
    		order.getItems().add(item);
    	}
    	
    	repository.save(order);
    	orderItemRepository.saveAll(order.getItems());
    	
    	return new OrderDTO(order);
	}
}
