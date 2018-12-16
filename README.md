# StackOverflow Q53692999

1. Run MySQL:
   ```shell
   ↪ docker run -P --name some-mysql -e MYSQL_ROOT_PASSWORD=logesh -d mysql:8                                                                                                   00:52:54
   cc395e45faa5d1cc3fdff3eeb35a6491202b75862ae5a519901c10fe02a80403
   ↪ docker ps                                                                                                                                                                  00:53:08
   CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                                               NAMES
   cc395e45faa5        mysql:8             "docker-entrypoint.s…"   3 seconds ago       Up 2 seconds        0.0.0.0:32773->3306/tcp, 0.0.0.0:32772->33060/tcp   some-mysql
   ```
   
2. Create database, user, and grant privileges
   ```sql
   CREATE DATABASE devops;
   CREATE USER 'logesh' IDENTIFIED BY 'logesh';
   GRANT ALL ON devops.* TO 'logesh';
   ```
   
3. Configure properties:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:32773/devops
   spring.datasource.username=logesh
   spring.datasource.password=logesh
   ```
   
4. Run the app:
   ```shell
     .   ____          _            __ _ _
    /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
   ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
    \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
     '  |____| .__|_| |_|_| |_\__, | / / / /
    =========|_|==============|___/=/_/_/_/
    :: Spring Boot ::        (v2.1.1.RELEASE)
   
   2018-12-17 00:51:56.267  INFO 16686 --- [           main] com.stackoverflow.q53692999.Main         : Starting Main on apadana with PID 16686 (~/Documents/projects/q53692999/target/classes started by foo in ~/Documents/projects/q53692999)
   2018-12-17 00:51:56.269  INFO 16686 --- [           main] com.stackoverflow.q53692999.Main         : No active profile set, falling back to default profiles: default
   2018-12-17 00:51:56.553  INFO 16686 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
   2018-12-17 00:51:56.568  INFO 16686 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 11ms. Found 0 repository interfaces.
   2018-12-17 00:51:56.777  INFO 16686 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
   2018-12-17 00:51:56.965  INFO 16686 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
   2018-12-17 00:51:56.994  INFO 16686 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
   	name: default
   	...]
   2018-12-17 00:51:57.022  INFO 16686 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.3.7.Final}
   2018-12-17 00:51:57.023  INFO 16686 --- [           main] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
   2018-12-17 00:51:57.084  INFO 16686 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
   2018-12-17 00:51:57.142  INFO 16686 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
   2018-12-17 00:51:57.444  INFO 16686 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
   2018-12-17 00:51:57.526  INFO 16686 --- [           main] com.stackoverflow.q53692999.Main         : Started Main in 1.446 seconds (JVM running for 1.746)
   2018-12-17 00:51:57.529  INFO 16686 --- [       Thread-5] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
   2018-12-17 00:51:57.531  INFO 16686 --- [       Thread-5] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
   2018-12-17 00:51:57.534  INFO 16686 --- [       Thread-5] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
   
   Process finished with exit code 0
   ```