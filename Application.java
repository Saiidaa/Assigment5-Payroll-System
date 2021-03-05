package com.company;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories

 class Application {
    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder.setType(EmbeddedDatabaseType.HSQL).build();
    }


}
