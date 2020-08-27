# springmvc-swagger-demo
springmvc（JDK1.6）结合swagger的案例


#### 由于现场项目老旧，采用word写接口文档，被排版弄得蛋疼，于是引入了swagger写接口文档；
#### 网上有不少springmvc+swagger的案例，找了不少博客躺了不少坑。这里说明一下遇到的坑

---------------
#### 1. swagger打开空白
##### config中添加注解@EnableWebMvc
##### web.xml中 DispatcherServlet  过滤路径为<url-pattern>/</url-pattern>，很多项目只过滤个.do .v导致没能读取到接口

--------
#### 2. swagger2.4版本接口DTO传参不显示详细参数

##### 解决办法：参数前加上@ModelAttribute 注解

--------------------------------------------------------------------------------
3. 关于版本选择
####  SpringMVC结合swagger——jdk1.6（真的蛋疼，是1.6不是1.8）
##### 老旧项目啊，要么swagger版本高导致
``` 
Failed to start bean 'documentationPluginsBootstrapper';
```

##### 要么版本低，设置成wagger2.5导致hidden属性失效,无法屏蔽字段，即使加上  @JsonIgnore、@JsonIgnoreProperties 等注解也无效，最后摸索发现使用2.6.1版本能够正常
```
<dependency>
   <groupId>io.springfox</groupId>
   <artifactId>springfox-swagger2</artifactId>
   <version>2.6.1</version>
</dependency>
<dependency>
   <groupId>io.springfox</groupId>
   <artifactId>springfox-swagger-ui</artifactId>
   <version>2.6.1</version>
</dependency>
<dependency>
   <groupId>com.fasterxml.jackson.core</groupId>
   <artifactId>jackson-databind</artifactId>
   <version>2.5.0</version>
</dependency>
```
-------------
#### 4.swagger2.6.1能打开了，但是点击文档url会“乱码“,导致节点打不开
##### swagger2.6.1版本自带的bug，要么升级，要么把tags改成英文；
```
@Api(tags = "userController" ,description = "用户基本信息相关接口")
@RestController
public class UserController {

}
```
