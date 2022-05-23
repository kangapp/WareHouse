## 业务数据生成

### 创建Mysql数据库
> 新建gmall数据库，并导入数据库结构脚本`gmall.sql`

### 准备文件
- application.properties
- gmall2020-mock-db-2021-11-14.jar

### 上传文件
> 将准备好的文件上传到/opt/module/db_log

### 生成业务数据
> 在/opt/module/db_log 执行 `java -jar gmall2020-mock-db-2021-11-14.jar`   
> 查看gmall数据库，观察业务数据是否生成