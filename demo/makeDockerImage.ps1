# Need to do this before running this script: Set-ExecutionPolicy -ExecutionPolicy Bypass -Scope Process
rmdir -Force -R target/dependency
mkdir target/dependency
# cp Dockerfile target/dependency/.
cd target/dependency
C:\'Program Files'\Java\jdk1.8.0_151\bin\jar -xf ../*.jar
cd ../..
# docker build -t lmcfrha/spring-boot-demo .
# docker push lmcfrha/spring-boot-demo
 