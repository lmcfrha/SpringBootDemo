# Need to do this before running this script: Set-ExecutionPolicy -ExecutionPolicy Bypass -Scope Process
# rmdir -Force -R target/dependency
 mkdir -Force target/dependency
 cp Dockerfile target/dependency/.
 cd target/dependency
C:\'Program Files'\Java\jdk1.8.0_151\bin\jar -xf ../*.jar
docker build -t lmcfrha/spring-boot-demo .

 