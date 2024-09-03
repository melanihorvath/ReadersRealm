package com.codecool.readersrealmbackend.service;

import com.codecool.readersrealmbackend.model.Book;
import com.codecool.readersrealmbackend.model.User;
import com.codecool.readersrealmbackend.model.dto.BookDTO;
import com.codecool.readersrealmbackend.model.dto.newDTO.NewBookDTO;
import com.codecool.readersrealmbackend.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookDTO getBookById(Long bookId){
        Optional<Book> optionalBook = bookRepository.findById(bookId);
        if(optionalBook.isEmpty()){
            throw new IllegalArgumentException("Invalid book ID.");
        }
        Book book = optionalBook.get();
        BookDTO bookDTO = new BookDTO(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getSeries(),
                book.getPublisher(),
                book.getISBN(),
                book.getNumberOfPages(),
                book.getDetails()
        );
        return bookDTO;
    }

    public String addNewBook(NewBookDTO newBookDTO){
        Book book = new Book();
        book.setTitle(newBookDTO.title());
        book.setAuthor(newBookDTO.author());
        book.setDetails(newBookDTO.details());
        book.setISBN(newBookDTO.ISBN());
        book.setPublisher(newBookDTO.publisher());
        book.setDetails(newBookDTO.details());
        book.setNumberOfPages(newBookDTO.numberOfPages());
        book.setSeries(newBookDTO.series());
        bookRepository.save(book);
        return "Book created successfully";
    }

    public String removeBookById(Long bookId){
        bookRepository.deleteById(bookId);
        return "Book has been deleted successfully";
    }

    public List<Book> getBooksByLabelId(Long labelId){
        return bookRepository.getBooksByLabelId(labelId);
    }

    //getBooksByAuthor
    //getBooksByTitle
    //getBooksBySeries
    //getBooksByPublisher
    //getReviewsByBookId
    //getUsersWhoMarkedAsFavorite


}
