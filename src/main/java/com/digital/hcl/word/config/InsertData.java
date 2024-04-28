package com.digital.hcl.word.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class InsertData {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Bean
    public void insertSqlScript() {
        if (!dataExists()) {
            String sqlScript = "INSERT INTO word (id, word) VALUES" +
                    "(1, 'apple')," +
                    "(2, 'aspire')," +
                    "(3, 'banana')," +
                    "(4, 'cherry')," +
                    "(5, 'dog')," +
                    "(6, 'elephant')," +
                    "(7, 'fox')," +
                    "(8, 'grape')," +
                    "(9, 'hat')," +
                    "(10, 'icecream')," +
                    "(11, 'jacket')," +
                    "(12, 'kite')," +
                    "(13, 'lemon')," +
                    "(14, 'mango')," +
                    "(15, 'nest')," +
                    "(16, 'orange')," +
                    "(17, 'pear')," +
                    "(18, 'queen')," +
                    "(19, 'rabbit')," +
                    "(20, 'sun')," +
                    "(21, 'table')," +
                    "(22, 'umbrella')," +
                    "(23, 'violet')," +
                    "(24, 'watermelon')," +
                    "(25, 'xylophone')," +
                    "(26, 'yellow')," +
                    "(27, 'zebra')," +
                    "(28, 'astronomy')," +
                    "(29, 'butterfly')," +
                    "(30, 'caramel')," +
                    "(31, 'dolphin')," +
                    "(32, 'elephant')," +
                    "(33, 'flamingo')," +
                    "(34, 'giraffe')," +
                    "(35, 'happiness')," +
                    "(36, 'island')," +
                    "(37, 'jungle')," +
                    "(38, 'kiwi')," +
                    "(39, 'lighthouse')," +
                    "(40, 'mountain')," +
                    "(41, 'nightingale')," +
                    "(42, 'octopus')," +
                    "(43, 'pineapple')," +
                    "(44, 'quicksilver')," +
                    "(45, 'rainbow')," +
                    "(46, 'sunflower')," +
                    "(47, 'tiger')," +
                    "(48, 'umbrella')," +
                    "(49, 'volcano')," +
                    "(50, 'waterfall');";

            jdbcTemplate.execute(sqlScript);
        }
    }

    private boolean dataExists() {
        String query = "SELECT count(*) FROM word";
        int count = jdbcTemplate.queryForObject(query, Integer.class);
        return count > 0;
    }
}
