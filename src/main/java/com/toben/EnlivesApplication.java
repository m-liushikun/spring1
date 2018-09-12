package com.toben;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 等价于 *@SpringBootConfiguration---->继承自@Configuration，二者功能也一致，标注当前类是配置类，并会将当前类内声明的一个或多个以@Bean注解标记的方法的实例纳入到spring容器中，并且实例名就是方法名。）
 *       *@EnableAutoConfiguration
 *       *@ComponentScan
 * 这三个注解。
 */
public class EnlivesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnlivesApplication.class, args);
	}
}
