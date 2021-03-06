# dubbox-boot

## dubbox-boot

dubbox-boot是一个基于Dubbox、SpringBoot，迅速构建启动的dubbox项目

各工程：

- base-common 接口与实体类定义，在消费者与提供者共享

- base-config dubbo、数据库、缓存、等等的配置管理，被各个服务提供者依赖

- base-consumer 消费者示例

- base-dynamic-service 提供者示例("动态"服务)

- base-user-service 提供者示例("用户"服务)

## dubbox-demo包含哪些功能

- 服务提供者示例
- 服务消费者示例
- 数据库、缓存、dubbo配置管理

## 准备

建议在maven安装目录下的`conf\settings.xml`的`<mirrors>`标签中添加如下镜像，以提高maven打包速度

```xml
<mirror>
    <id>alimaven</id>
    <name>aliyun maven</name>
    <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    <mirrorOf>central</mirrorOf>
</mirror>
```

下载dubbox源码并且编译：

> git clone git@github.com:dangdangdotcom/dubbox.git
执行maven命令`mvn clean install -Dmaven.test.skip`

## 快速启动

- 下载源码`git clone git@github.com:zylele/dubbox-demo.git`

- 生成eclipse项目`mvn eclipse:eclipse`

- 导入eclipse

- 执行初始化[init.sql](init.sql)

- 启动`ZooKeeper`

- 启动提供者`UserServiceProvider`和`DynamicServiceProvider`

- 启动消费者`BaseConsumer`

- 访问`http://localhost:1000/user/get/{1,2,3}`，`http://localhost:1000/dynamic/get/{1,2,3}`

服务主要配置详情请点击我的博文[dubbox快速指南](http://lle.coding.me/2017/03/07/dubbo-demo/)

---

dubbox还具有相当多的配置功能，如负载均衡、集群容错，多协议、多注册中心等

更多示例与参考手册，可查看[dubbo用户指南](http://dubbo.io/User+Guide-zh.htm)