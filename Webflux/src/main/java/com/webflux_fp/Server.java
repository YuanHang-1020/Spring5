package com.webflux_fp;

import com.webflux_anno.service.Impl.UserServiceImpl;
import com.webflux_anno.service.UserService;
import com.webflux_fp.handler.UserHandler;
import org.springframework.http.ReactiveHttpInputMessage;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.netty.http.server.HttpServer;


import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

/**
 * @Author hang.yuan
 * @Date 2022/9/26 14:05
 * @Description
 * @Ref
 */
public class Server {

    // 1、创建Router路由
    public RouterFunction<ServerResponse> routerFunction() {
        // 创建handler对象
        UserService userService = new UserServiceImpl();
        UserHandler userHandler = new UserHandler(userService);
        // 设置路由
        return RouterFunctions.route(
                GET("/users/{id}").and(accept(APPLICATION_JSON)), userHandler::getUserById)
                .andRoute(GET("/users").and(accept(APPLICATION_JSON)), userHandler::getAllUsers);
    }

    // 2、创建服务器完成适配
    public void createReactorServer() {
        // 路由和handle适配
        RouterFunction<ServerResponse> route = routerFunction();
        HttpHandler httpHandler = toHttpHandler(route);
        ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(httpHandler);

        // 创建服务器
        HttpServer httpServer = HttpServer.create();
        httpServer.handle(adapter).bindNow();

    }

    public static void main(String[] args) throws Exception {

        Server server = new Server();
        server.createReactorServer();
        System.out.println("enter to exit");
        System.in.read();

    }

}
