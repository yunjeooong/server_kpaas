package com.tripleS.server.friend.repository;

import com.tripleS.server.friend.domain.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {

    List<Friend> findAllById(Long userId);
    Optional<Friend> findByUserIdAndId(Long userId, Long friendId);
}
