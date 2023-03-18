package com.lh.controller;


import com.lh.pojo.Book;
import com.lh.sevice.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookServiceImp")
    private BookService bookService;

    @RequestMapping("/allbook")
    public String allBook(Model model){
        List<Book> list = bookService.queryAllBooks();
        model.addAttribute("list",list);
//        model.addAttribute("err","");
        return "allbook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(){

        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book){
        System.out.println("添加书籍："+book.getBookName()+"成功！");
        bookService.insertBook(book);
        return "redirect:/book/allbook";
    }

    @RequestMapping("/toUptateBook/{bookID}")
    public String toUptate(@PathVariable int bookID,Model model){
        Book book = bookService.queryBookById(bookID);
        model.addAttribute("udbook",book);
        return "uptateBook";
    }

    @RequestMapping("/uptateBook")
    public String uptateBook(Book book){
//        System.out.println(book);
//        在前端有个隐患。在于不可见的表单传递内容可以被修改。
        bookService.updateBookById(book);
        return "redirect:/book/allbook";
    }

    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable int bookID){
        bookService.deleteBookById(bookID);
        return "redirect:/book/allbook";
    }

    @RequestMapping("/queryBook")
    public String queryBookByName(String bookName,Model model){
        List<Book> list = bookService.queryBookByName(bookName);
        if (list.isEmpty()){
            List<Book> books = bookService.queryAllBooks();
            for (Book book : books) {
                list.add(book);
            }
            model.addAttribute("err","未查到");
        }
        model.addAttribute("list",list);
//        model.addAttribute("err","");
        return "allbook";
    }
}
