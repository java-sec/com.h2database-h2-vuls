# 基础知识 

## h2是什么

用Java开发的嵌入式数据库。

## 两种模式 

运行模式：
- 内嵌模式（本地连接，使用JDBC）
- 服务器模式(远程连接，从其他进程或其他机器访问，在TCP层使用JDBC或ODBC)
- 混合模式（设置AUTO_SERVER=TRUE，同时支持本地或远程）

## WebServer



## 特性：连接时执行SQL

这个最初的目的是为了在连接创建时执行一些创建schema和初始化数据之类的工作，比如：









参考资料：

- http://www.h2database.com/html/features.html?highlight=init&search=init#execute_sql_on_connection





## 特性：通过JavaScript执行命令



