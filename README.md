# LavoroStagionale-Backend

Sito cercolavorostagionale (logo + favicon icon)

home page (spiegazione dell'intermediazione tra imprenditori e lavoratori stagionali)
    1) un carousel con tutti i loghi degli imprenditori iscritti
    3) casistiche in percentuale di quanti hanno trovato lavoro rispetto agli iscritti
    2) un carousel con tutte le testimonianze di imprenditori che hanno trovato quello che cercavano tramite il sito)
Bottoni Login/Iscriviti/Logout (in alto a destra)

Pagina di Login e Iscrizione (imprenditori e stagionali)

Pagina profilo imprenditore
    elenco delle sue attività con possibilità di inserirne di nuove o cancellarle
    elenco delle sue recensioni con la possibilità di cancellare e/o inserire una nuova (stelle da 1 a 5 con commento)
    elenco delle ricerche di personale di cui ha bisogno (posizione aperte e chiuse)
        se una posizione è stata chiusa con uno stagionale in anagrafica indicarlo in fase di chiusura    
    ricerca dei profili dei lavoratori stagionali per tipologia del profilo (cameriere, barista, etc.), con la possibilità
di vederne una breve sintesi e il link al suo profilo 

Pagina profilo lavoratore stagionale
    foto del profilo
    elenco dei suoi lavori stagionali con possibilità di cancellare e/o inserire uno nuovo
    elenco delle posizioni per cui sta cercando lavoro    

Il bottone logout sempre presente dopo aver effettuato il login

Il sito deve essere costruito utilizzando HTML/CSS/JS lato client e JSP/Java Bean lato server
Il sito deve essere responsive
Si possono scegliere i framework che si vogliono lato CSS/JS
Il database è MySQL

```
mysql://uoggwhue2lrj4qyt:nNHbPBJBYyf5abhrEice@bysp8oufbeprslc9nfpj-mysql.services.clever-cloud.com:3306/bysp8oufbeprslc9nfpj
```

Mettete questo nel nbproject/project.properties
```
annotation.processing.enabled=true
annotation.processing.enabled.in.editor=true
annotation.processing.processors.list=
annotation.processing.run.all.processors=true
annotation.processing.source.output=${build.generated.sources.dir}/ap-source-output
build.classes.dir=${build.web.dir}/WEB-INF/classes
build.classes.excludes=**/*.java,**/*.form
build.dir=build
build.generated.dir=${build.dir}/generated
build.generated.sources.dir=${build.dir}/generated-sources
build.test.classes.dir=${build.dir}/test/classes
build.test.results.dir=${build.dir}/test/results
build.web.dir=${build.dir}/web
build.web.excludes=${build.classes.excludes}
client.urlPart=
compile.jsps=false
conf.dir=${source.root}/conf
debug.classpath=${build.classes.dir}:${javac.classpath}
debug.test.classpath=\
    ${run.test.classpath}
display.browser=true
# Files to be excluded from distribution war
dist.archive.excludes=
dist.dir=dist
dist.ear.war=${dist.dir}/${war.ear.name}
dist.javadoc.dir=${dist.dir}/javadoc
dist.war=${dist.dir}/${war.name}
endorsed.classpath=\
    ${libs.javaee-endorsed-api-7.0.classpath}
excludes=
includes=**
j2ee.compile.on.save=true
j2ee.copy.static.files.on.save=true
j2ee.deploy.on.save=true
j2ee.platform=1.7-web
j2ee.platform.classpath=${j2ee.server.home}/lib/annotations-api.jar:${j2ee.server.home}/lib/catalina-ant.jar:${j2ee.server.home}/lib/catalina-ha.jar:${j2ee.server.home}/lib/catalina-storeconfig.jar:${j2ee.server.home}/lib/catalina-tribes.jar:${j2ee.server.home}/lib/catalina.jar:${j2ee.server.home}/lib/commons-lang3-3.8.1.jar:${j2ee.server.home}/lib/commons-logging-1.2.jar:${j2ee.server.home}/lib/ecj-4.6.3.jar:${j2ee.server.home}/lib/el-api.jar:${j2ee.server.home}/lib/hsqldb-2.5.0.jar:${j2ee.server.home}/lib/jackcess-3.0.1.jar:${j2ee.server.home}/lib/jasper-el.jar:${j2ee.server.home}/lib/jasper.jar:${j2ee.server.home}/lib/jaspic-api.jar:${j2ee.server.home}/lib/jsp-api.jar:${j2ee.server.home}/lib/mysql-connector-java-8.0.27.jar:${j2ee.server.home}/lib/servlet-api.jar:${j2ee.server.home}/lib/sqlite-jdbc-3.36.0.3.jar:${j2ee.server.home}/lib/tomcat-api.jar:${j2ee.server.home}/lib/tomcat-coyote.jar:${j2ee.server.home}/lib/tomcat-dbcp.jar:${j2ee.server.home}/lib/tomcat-i18n-de.jar:${j2ee.server.home}/lib/tomcat-i18n-es.jar:${j2ee.server.home}/lib/tomcat-i18n-fr.jar:${j2ee.server.home}/lib/tomcat-i18n-ja.jar:${j2ee.server.home}/lib/tomcat-i18n-ko.jar:${j2ee.server.home}/lib/tomcat-i18n-ru.jar:${j2ee.server.home}/lib/tomcat-i18n-zh-CN.jar:${j2ee.server.home}/lib/tomcat-jdbc.jar:${j2ee.server.home}/lib/tomcat-jni.jar:${j2ee.server.home}/lib/tomcat-util-scan.jar:${j2ee.server.home}/lib/tomcat-util.jar:${j2ee.server.home}/lib/tomcat-websocket.jar:${j2ee.server.home}/lib/websocket-api.jar
j2ee.server.type=Tomcat
jar.compress=false
javac.classpath=
# Space-separated list of extra javac options
javac.compilerargs=
javac.debug=true
javac.deprecation=false
javac.processorpath=\
    ${javac.classpath}
javac.source=1.8
javac.target=1.8
javac.test.classpath=\
    ${javac.classpath}:\
    ${build.classes.dir}
javac.test.processorpath=\
    ${javac.test.classpath}
javadoc.additionalparam=
javadoc.author=false
javadoc.encoding=${source.encoding}
javadoc.noindex=false
javadoc.nonavbar=false
javadoc.notree=false
javadoc.preview=true
javadoc.private=false
javadoc.splitindex=true
javadoc.use=true
javadoc.version=false
javadoc.windowtitle=
lib.dir=${web.docbase.dir}/WEB-INF/lib
no.dependencies=false
persistence.xml.dir=${conf.dir}
platform.active=default_platform
resource.dir=setup
run.test.classpath=\
    ${javac.test.classpath}:\
    ${build.test.classes.dir}
# Space-separated list of JVM arguments used when running a class with a main method or a unit test
# (you may also define separate properties like run-sys-prop.name=value instead of -Dname=value):
runmain.jvmargs=
source.encoding=UTF-8
source.root=src
src.dir=${source.root}/java
test.src.dir=test
war.content.additional=
war.ear.name=${war.name}
war.name=GoogleSuggestions.war
web.docbase.dir=web
webinf.dir=web/WEB-INF
```
