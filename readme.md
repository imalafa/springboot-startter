# 项目文件说明

## 根目录
**main.java.example.demo**
- 启动类   
  DemoApplication.java放在根目录example.demo包下
- 数据层  
  - 数据实体类   
    jpa项目: example.demo.domain   
    mybatis项目: example.demo.entity  
  - 数据传输对象  
    example.demo.dto  
    (数据传输对象Data Transfer Object用于封装多个实体类之间的关系，不破坏原有的实体类结构)
  - 视图包装对象  
    example.demo.vo  
    (视图包装对象View Object用于封装客户端请求的数据，防止部分数据泄露(如，管理员ID)，保证数据安全，不破坏 原有的实体类结构)
- 数据接口访问层Dao   
  jpa项目： example.demo.repository  
  mybatis项目： example.demo.mapper  
- 数据服务层  
  接口层：example.demo.service  
  接口实现层：example.demo.service.impl  
- 工具类库utils     
  example.demo.utils
- 配置类config    
  example.demo.config
- 常量   
  example.demo.config
- 前端控制器层Controller   
  example.demo.controller


## 资源目录结构
**main.java.resources**
- 项目配置文件：resources/application.yml   
- 静态资源目录：resources/static/   
  用于存放html、css、js、图片等资源   
- 视图模板目录：resources/templates/    
  用于存放jsp、thymeleaf等模板文件   
- mybatis映射文件：resources/mappers/  
- mybatis配置文件：resources/spring-mybatis.xml   



