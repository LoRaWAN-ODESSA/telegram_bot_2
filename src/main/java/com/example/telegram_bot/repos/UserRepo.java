package com.example.telegram_bot.repos;

import com.example.telegram_bot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findById(long id);
}
