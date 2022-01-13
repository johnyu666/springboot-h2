package dao;


import cn.johnyu.MyApp;
import cn.johnyu.dao.BookDaoImpl;
import cn.johnyu.pojo.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest(classes = MyApp.class)
@RunWith(SpringRunner.class)
public class BookDaoImplTest {
    @Autowired
    private BookDaoImpl bookDao;
    @Autowired
    private JdbcTemplate template;
    @Test
    public void testAdd(){
       int count= bookDao.addBook(new Book(null,"tomli"));
        Assert.assertTrue(count==1);
    }
}
