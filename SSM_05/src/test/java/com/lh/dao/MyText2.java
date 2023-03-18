package com.lh.dao;

import com.lh.pojo.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyText2 {

    @Test
    public void text2(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("SpringConfig/ApplicationContext.xml");
        BookMapper bookMapper = context.getBean("bookMapper", BookMapper.class);
        List<Book> books = bookMapper.queryAllBooks();
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
