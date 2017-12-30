package za.co.thecompany.database;

import org.springframework.context.annotation.Configuration;

import javax.activation.DataSource;

@Configuration
public class DatabaseConfig {

    public DataSource dataSource;

    public DataSource getDataSource() {
        return null;
    }
}
