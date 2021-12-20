### springboot笔记

---
1. 约定大于配置，除了自己修改的配置，其余配置默认使用springboot自动装配的配置

2. 自定义配置类:

3. 实现容器监听器接口（ApplicationListener）可以实现对容器事件完成的监听

4. application.properties与application.yml使用的优先级，application.properties的优先级更高，可以在其中动态配置生效文件，不同环境使用不同的配置文件

5. CommandLineRunner用于在应用初始化后，执行一段代码逻辑，在应用生命周期里只执行一次

6. ApplicationRunner与CommandLineRunner参数不一样，app参数为ApplicationArguments，command为String数组
