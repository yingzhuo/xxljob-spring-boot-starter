usage:
	@echo "=============================================================="
	@echo "usage     =>  显示菜单"
	@echo "wrapper   =>  初始化GradleWrapper"
	@echo "compile   =>  编译"
	@echo "clean     =>  清理"
	@echo "build     =>  打包"
	@echo "publish   =>  发布"
	@echo "install   =>  本地安装"
	@echo "github    =>  提交源代码"
	@echo "=============================================================="

wrapper:
	@gradle wrapper --gradle-distribution-url 'https://mirrors.cloud.tencent.com/gradle/gradle-8.12.1-bin.zip'

compile:
	@gradlew classes

build:
	@gradlew build -x"test"

publish:
	@gradlew publish -x"test"

install:
	@gradlew publishToMavenLocal -x"test"

clean:
	@gradlew clean -q

github: clean
	@git status
	@git add .
	@git commit -m "$(shell /bin/date "+%F %T")"
	@git push

.PHONY: usage compile build publish install clean github