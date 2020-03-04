# Setting Up My Git Playground

## Create a Git Repositiory

```bash
obama@teben:~/tmp/gitplayground$ git commit -a -m"initial commit"
[master (root-commit) 559da96] initial commit
 1 file changed, 3 insertions(+)
 create mode 100644 README.md
obama@teben:~/tmp/gitplayground$ git remote add origin https://teben.hopto.org:9080/teben.hopto.org/git-playground.git
obama@teben:~/tmp/gitplayground$ git push -u origin --all
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Delta compression using up to 8 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 299 bytes | 299.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://teben.hopto.org:9080/teben.hopto.org/git-playground.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.
obama@teben:~/tmp/gitplayground$ git push -u origin --tags
Everything up-to-date
obama@teben:~/tmp/gitplayground$ 
```

## Create a Maven Project

```bash
obama@teben:~/tmp/gitplayground$ 
obama@teben:~/tmp/gitplayground$ mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] >>> maven-archetype-plugin:3.1.2:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO] 
[INFO] <<< maven-archetype-plugin:3.1.2:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO] 
[INFO] 
[INFO] --- maven-archetype-plugin:3.1.2:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Batch mode
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: maven-archetype-quickstart:1.4
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: com.mycompany.app
[INFO] Parameter: artifactId, Value: my-app
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: com.mycompany.app
[INFO] Parameter: packageInPathFormat, Value: com/mycompany/app
[INFO] Parameter: package, Value: com.mycompany.app
[INFO] Parameter: groupId, Value: com.mycompany.app
[INFO] Parameter: artifactId, Value: my-app
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Project created from Archetype in dir: /data/sdb1/home/obama/tmp/gitplayground/my-app
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.441 s
[INFO] Finished at: 2020-03-04T19:01:33+01:00
[INFO] ------------------------------------------------------------------------
obama@teben:~/tmp/gitplayground$ 
```

## Add Maven Project to Repository

```bash
obama@teben:~/tmp/gitplayground$ git add my-app/
obama@teben:~/tmp/gitplayground$ git commit my-app/* -m"add default maven project"
[master 58884f9] add default maven project
 3 files changed, 108 insertions(+)
 create mode 100644 my-app/pom.xml
 create mode 100644 my-app/src/main/java/com/mycompany/app/App.java
 create mode 100644 my-app/src/test/java/com/mycompany/app/AppTest.java
obama@teben:~/tmp/gitplayground$ git push
Enumerating objects: 18, done.
Counting objects: 100% (18/18), done.
Delta compression using up to 8 threads
Compressing objects: 100% (7/7), done.
Writing objects: 100% (17/17), 1.89 KiB | 967.00 KiB/s, done.
Total 17 (delta 0), reused 0 (delta 0)
To https://teben.hopto.org:9080/teben.hopto.org/git-playground.git
   559da96..58884f9  master -> master
obama@teben:~/tmp/gitplayground$ 
```
