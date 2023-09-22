package com.allan.Application_Climate.repositories;

import com.allan.Application_Climate.models.user_models.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends MongoRepository<UserDocument,Long> {
    Optional<UserDocument> findByUsername(String username);
}
