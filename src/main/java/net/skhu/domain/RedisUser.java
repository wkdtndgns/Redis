package net.skhu.domain;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import lombok.Data;

/**
 * Created by ds on 2018-04-09.
 */

@Data
@RedisHash("user") //레디스 테이블 키 값
public class RedisUser implements Serializable {

    private static final long serialVersionUID = -287881979735272273L;

    //객체의 키 값
    @Id
    String id;
    //세컨더리 인덱스, 보조키
    @Indexed
    String name;
    String password;
}

