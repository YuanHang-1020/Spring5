package com.reactor;

import org.springframework.web.server.WebHandler;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author hang.yuan
 * @Date 2022/9/26 10:41
 * @Description
 * @Ref
 */
public class ReactorTest {

    public static void main(String[] args) {

        // just方法直接生明相关元素
        Flux.just(1,2,3,4).subscribe(System.out::println);
        Mono.just(1).subscribe(System.out::println);

        //其他方法
        Integer[] array = {1,2,3,4};
        Flux.fromArray(array);

        List<Integer> list = Arrays.asList(array);
        Flux.fromIterable(list);

        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream);


    }

}
