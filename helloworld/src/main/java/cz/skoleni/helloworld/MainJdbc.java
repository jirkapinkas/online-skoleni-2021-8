package cz.skoleni.helloworld;

import com.zaxxer.hikari.HikariDataSource;
import lombok.Builder;
import lombok.Data;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MainJdbc {

    public static void main(String[] args) throws SQLException {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:hsqldb:hsql://localhost/eshop");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        dataSource.setMaximumPoolSize(1); // pocet Connection

//        try(Connection connection = dataSource.getConnection();
//            PreparedStatement statement = connection.prepareStatement("select * from item");
//            ResultSet resultSet = statement.executeQuery()) {
//            while(resultSet.next()) {
//                System.out.println(resultSet.getString("name"));
//            }
//        }

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

//        List<String> names = jdbcTemplate.queryForList("select name from item", String.class);
//        names.forEach(System.out::println);

        List<Item> items = jdbcTemplate.query("select * from item", (rs, i) -> {
            return Item.builder()
                    .name(rs.getString("name"))
                    .price(rs.getDouble("price"))
                    .build();
        });
        items.forEach(System.out::println);
    }

}

@Data
@Builder
class Item {
    private String name;
    private double price;
}