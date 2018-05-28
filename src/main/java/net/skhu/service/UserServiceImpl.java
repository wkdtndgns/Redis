package net.skhu.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.domain.RedisUser;
import net.skhu.repository.RedisRepository;

/**
 * Created by ds on 2018-04-09.
 */

@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RedisRepository redisRepository;

    @Override
    public RedisUser findById(final String id) {
        Optional<RedisUser> redisUser = redisRepository.findById(id);
        if(!redisUser.isPresent()) return null;
        else {
            return redisUser.get();
        }
    }

    @Override
    public List<RedisUser> findByName(final String name) {
        List<RedisUser> list = redisRepository.findByName(name);
        return list;
    }

    @Override
    public void saveUser(final RedisUser user) {
        redisRepository.save(user);
    }


    @Override
    public void deleteUser(final String id) {
        redisRepository.deleteById(id);
    }
}
