package com.lh.text;

import com.lh.pojo.Book;
import com.lh.sevice.imp.BookServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytext2 {
    @Test
    public void text(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("SpringConfig/ApplicationContext.xml");
        BookServiceImp bookServiceImp = context.getBean("bookServiceImp", BookServiceImp.class);
        List<Book> books =
                bookServiceImp.queryAllBooks();
        System.out.println(books.get(0));


    }
}
