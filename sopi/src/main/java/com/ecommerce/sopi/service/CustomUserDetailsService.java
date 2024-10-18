package com.ecommerce.sopi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ecommerce.sopi.entity.UserEntity;
import com.ecommerce.sopi.repository.UserRepository;
import com.ecommerce.sopi.service.impl.ClientService;
 
public class CustomUserDetailsService implements UserDetailsService {
 
    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    private ClientService clientService;
     
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepo.findByUsername(username).orElseThrow(()->new RuntimeException("Khong ton tai user!"));
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        clientService.updateVisit();
        return new CustomUserDetails(user);
    }
 
}
