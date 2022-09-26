package com.webflux_fp.handler;

import com.webflux_anno.entity.User;
import com.webflux_anno.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.BodyInserters.fromResource;

/**
* @Author hang.yuan
* @Date 2022/9/26 13:44
* @Description
* @Ref
*/
public class UserHandler {

    private final UserService userService;
    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    // 通过id查询
    public Mono<ServerResponse> getUserById(ServerRequest request) {
        // 获取id值
        Integer userId = Integer.valueOf(request.pathVariable("id"));
        // 空值处理
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();
        // 调用Service方法得到数据
        Mono<User> userMono = this.userService.getUserById(userId);
        return
                userMono.flatMap(person -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromObject(person)))
                        .switchIfEmpty(notFound);
    }

    // 查询所有
    public Mono<ServerResponse> getAllUsers(ServerRequest request) {
        // Service得到结果
        Flux<User> users = this.userService.getAllUser();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(users, User.class);
    }

    // 添加
    public Mono<ServerResponse> saveUser(ServerRequest request) {
        Mono<User> userMono = request.bodyToMono(User.class);
        return
                ServerResponse.ok().build(this.userService.saveUserInfo(userMono));
    }




}
