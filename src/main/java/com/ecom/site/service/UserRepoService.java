package com.ecom.site.service;


import com.ecom.site.Model.User;
import com.ecom.site.Model.UserDetail;
import com.ecom.site.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserRepoService implements UserDetailsService {

    final UserRepo userRepo;

    @Autowired
    public UserRepoService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }



    @Override
    public UserDetail loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findById(username).orElse(null);

        if (user == null) {
            System.out.println("user not found");
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new UserDetail(user);
    }
}
