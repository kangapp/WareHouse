## 模拟日志生成

### 准备文件
- application.yml
- gmall2020-mock-log-2021-10-10.jar
- path.json
- logback.xml

### 上传文件
> 将准备好的文件上传到/opt/module/applog

### 生成日志
> 在/opt/module/applog 执行 `java -jar gmall2020-mock-log-2021-10-10.jar`   
> 在logback.xml配置的日志生成目录查看生成的日志文件

### 日志生成脚本
```bash
#!/bin/bash
for i in hadoop100; do
    echo "========== $i =========="
    ssh $i "cd /opt/module/applog/; java -jar gmall2020-mock-log-2021-10-10.jar >/dev/null 2>&1 &"
done 
```