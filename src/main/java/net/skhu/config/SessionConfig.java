package net.skhu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by ds on 2018-03-26.
 */

/**
 * Reids의 설정 파일
 */

//설정 파일임을 명시
@Configuration
//Redis Repository를 사용하겠다 명시
@EnableRedisRepositories
public class SessionConfig {

    @Value("${spring.redis.host}")
    private String redisHost;

    @Value("${spring.redis.port}")
    private int redisPort;

    @Value("${spring.redis.password}")
    private String redisPassword;

    /**
     * Jedis는 자바에서 Redis을 사용하기 위한 클라이언트
     * @return redis 설정 객체
     */
    @Bean
    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        return jedisPoolConfig;
    }

    /**
     * application.properties 파일의 redis 설정을 토대로 redis커넥션 팩토리 객체 생성
     * @param jedisPoolConfig
     * @return
     */
    @Bean
    public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig jedisPoolConfig) {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(jedisPoolConfig);
        jedisConnectionFactory.setHostName(redisHost);
        jedisConnectionFactory.setPort(redisPort);
        jedisConnectionFactory.setPassword(redisPassword);
        jedisConnectionFactory.setUsePool(true);
        return jedisConnectionFactory;
    }
}


