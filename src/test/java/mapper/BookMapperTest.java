package mapper;

import cn.johnyu.MyApp;
import cn.johnyu.mapper.BookMapper;
import cn.johnyu.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MyApp.class)
@RunWith(SpringRunner.class)
public class BookMapperTest {
    @Autowired
    private BookMapper bookMapper;
    @Test
    public void testAddBook(){
        Book book=new Book(null ,"lll");
        bookMapper.addBook(book);
        System.out.println(book.getId());
    }
    @Test
    public void testLoadBook(){
        Book book=bookMapper.loadBook(1);
        System.out.println(book.getName());
    }

}
