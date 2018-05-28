package net.skhu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.skhu.domain.RedisUser;

/**
 * Created by ds on 2018-04-09.
 */

public interface RedisRepository extends CrudRepository<RedisUser, String> {
    List<RedisUser> findByName(final String name);


}
