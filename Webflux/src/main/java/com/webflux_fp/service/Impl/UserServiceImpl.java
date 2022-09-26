package com.webflux_fp.service.Impl;

import com.webflux_fp.entity.User;
import com.webflux_fp.service.UserService;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author hang.yuan
 * @Date 2022/9/26 11:19
 * @Description
 * @Ref
 */
@Repository
public class UserServiceImpl implements UserService {

    // 创建map集合存储数据
    private final Map<Integer, User> users = new HashMap<>();

    public UserServiceImpl() {
        this.users.put(1, new User("lucy", "F", 20));
        this.users.put(2, new User("mary", "F", 20));
        this.users.put(3, new User("jack", "M", 20));
    }


    @Override
    public Mono<User> getUserById(int id) {
        return Mono.justOrEmpty(this.users.get(id));
    }

    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(this.users.values());
    }

    @Override
    public Mono<Void> saveUserInfo(Mono<User> user) {
        return user.doOnNext(person -> {
            int id = users.size() + 1;
            users.put(id, person);
        }).thenEmpty(Mono.empty());
    }
}
