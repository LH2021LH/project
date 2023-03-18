package com.lh.sevice;

import com.lh.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> queryAllBooks();

    //1、无脑增加书籍
    int insertBook(Book book);

    //2、通过id删除书籍
    int deleteBookById(int bookID);

    //3、通过id改变书籍，这里想着有闯过来的book内的原id
    int updateBookById(Book book);

    //4、根据id查询书籍
    Book queryBookById(int bookID);

    //5、根据名字查询书籍（我们支持用模糊查询）
    List<Book> queryBookByName(String bookName);
}
