package net.skhu.service;

import java.util.List;

import net.skhu.domain.RedisUser;

/**
 * Created by ds on 2018-04-09.
 */
public interface UserService {
    RedisUser findById(final String id);
    List<RedisUser> findByName(final String name);
    void saveUser(final RedisUser user);
    void deleteUser(final String id);
}
