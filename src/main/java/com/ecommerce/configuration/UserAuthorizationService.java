package com.ecommerce.configuration;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;

@Service
public class UserAuthorizationService {

  @Autowired
 private  UserRepository userRepository;
  
  public boolean canUpdate(long loggedInUser, long userId){
    if(loggedInUser != userId)
      return false;

    Optional<User> optional = userRepository.findById(userId);
    if(!optional.isPresent())
      return false;

    User inDB = optional.get();
   // LocalDateTime twentyFourHoursAgo = LocalDateTime.now().minusHours(24);
    //if(inDB.getLastUpdated() != null && inDB.getLastUpdated().isAfter(twentyFourHoursAgo))
     // return false;

    return true;
  }
}
