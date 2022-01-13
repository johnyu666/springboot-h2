package cn.johnyu.dao;

import cn.johnyu.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl {
    @Autowired
    private JdbcTemplate template;
    public int addBook(Book book){
      return   template.update("insert into books (name) values(?)",new Object[]{book.getName()});
    }
}
