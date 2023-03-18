package com.lh.text.sql;

import com.lh.pojo.Book;
import com.lh.sevice.imp.BookServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BookSqlText {
    @Test
    public void selectAllText(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("SpringConfig/ApplicationContext.xml");
        BookServiceImp bookServiceImp = context.getBean("bookServiceImp", BookServiceImp.class);
        List<Book> books =
                bookServiceImp.queryAllBooks();
        for (Book book : books) {
            System.out.println(book);
        }

    }
    @Test
    public void insertText(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("SpringConfig/ApplicationContext.xml");
        BookServiceImp bookServiceImp = context.getBean("bookServiceImp", BookServiceImp.class);
        Book book = new Book(1, "活啊", 18, "干得漂亮");
        int i = bookServiceImp.insertBook(book);
        if(i > 0){
            System.out.println("成功插入");
        }

    }

    @Test
    public void updateText(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("SpringConfig/ApplicationContext.xml");
        BookServiceImp bookServiceImp = context.getBean("bookServiceImp", BookServiceImp.class);
        Book book = new Book(5, "捕获啦", 18, "干得漂亮");

        int i = bookServiceImp.updateBookById(book);
        if(i > 0){
            System.out.println("成功修改");
        }

    }

    @Test
    public void deleteText(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("SpringConfig/ApplicationContext.xml");
        BookServiceImp bookServiceImp = context.getBean("bookServiceImp", BookServiceImp.class);
//        Book book = new Book(1, "活啊", 18, "干得漂亮");
        int i = bookServiceImp.deleteBookById(5);
        if(i > 0){
            System.out.println("成功删除");
        }

    }
    @Test
    public void queryBookByidText(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("SpringConfig/ApplicationContext.xml");
        BookServiceImp bookServiceImp = context.getBean("bookServiceImp", BookServiceImp.class);
//        Book book = new Book(1, "活啊", 18, "干得漂亮");
        Book book = bookServiceImp.queryBookById(1);
        System.out.println(book);

    }

}
