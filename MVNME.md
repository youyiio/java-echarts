# mvn使用手册

## 环境准备

* sonatype账号注册
* sonatype新建发布
* gpg4win生成密钥
* 发布公钥到GPS key-servers，
  > gpg --keyserver hkp://keyserver.ubuntu.com:11371 --send-keys

## 编译

> mvn compile

## 测试

> mvn 

## 打包

> mvn package

> mvn package -Dmaven.test.skip=true

> mvn clean package -Dmaven.test.skip=true

## 安装

> mvn install

> mvn install -Dmaven.test.skip=true

## 部署jar包

> mvn clean deploy

> mvn clean deploy -Dmaven.test.skip=true

> mvn clean deploy –P release -Dgpg.passphrase=xxx

> mvn clean deploy -Dmaven.test.skip=true –P release -Dgpg.passphrase=xxx