package cn.johnyu.controller;

import cn.johnyu.dao.BookDaoImpl;
import cn.johnyu.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
    @Autowired
    BookDaoImpl bookDao;
    @RequestMapping("/test")
    public String test1(){
        bookDao.addBook(new Book(null,"johnyu123"));
        return "success123";
    }
}
