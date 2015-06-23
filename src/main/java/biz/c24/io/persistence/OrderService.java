package biz.c24.io.persistence;

import biz.c24.io.gettingstarted.Order;
import biz.c24.io.spring.integration.jdbc.CdoSqlParameterSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class OrderService {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Value("${inbound.insert.expression}")
    private String insertStatment;

    @Autowired
    public OrderService(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public void insertOrder(Order order) {
        SqlParameterSource source = new CdoSqlParameterSource(order);
        jdbcTemplate.update(insertStatment, source);
    }
}
