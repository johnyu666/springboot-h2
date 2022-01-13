package cn.johnyu.mapper;

import cn.johnyu.pojo.Book;
import org.springframework.stereotype.Component;

@Component
public interface BookMapper {
    void addBook(Book book);
    Book loadBook(int id);
}
