# 工程笔记

## MyBatis:
* Mapper: tk.mybatis, util包下的MyMapper继承通用接口
* PageHelper
* Mybatis
* mybatis-generator-core
> 陪着使用时, 所用版本用本项目中的版本

## 解决跨域请求
* 只需配置: io.haitaoc.config.CrosConfig

## FlyWay:
* 需要在pom中添加``flyway-core``的依赖并在yaml中配置

## JSON结果处理:
* util 包下的JSONResult