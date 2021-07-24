package com.jensen;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book= new Book("Språkporten 123", 300, "Monika");
    @BeforeAll
    static void setUp() {
        System.out.println("Testing the book class");
    }

//-----------Test cases with motivation------------------------------------------------------------
    @Test
    void testSetTitle()
    {
        book.setTitle("Vill inte flyta");
        assertTrue(book.getTitle().contains("Vill"));
        assertEquals("Vill inte flyta",book.getTitle());
    }
    @Test
    void testSetTitleIsNull()
    {
        book.setTitle(null);
        assertNotNull(book.getTitle());
        assertEquals("Språkporten 123",book.getTitle());
    }
    @Test
    void testSetTitleLengthToZero()
    {
        Exception exception= assertThrows(IllegalArgumentException.class,()->book.setTitle(""));
        assertTrue(exception.getMessage().contains("Title most include characters"));
    }
    @Test
    void testIfPagesAreLessThanZero()
    {
        assertThrows(IllegalArgumentException.class,()->book.setPages(-2));
        assertNotNull(book.getPages());
    }
//--------------------------------------------------------------------------------------------------
    @Test
    void testGetTitle()
    {
        assertEquals("Språkporten 123",book.getTitle());
    }

    @Test
    void testGetPages()
    { //assertNotNull(book.getPages());
        assertEquals(300,book.getPages());
    }

    @Test
    void testSetPagesToZero()
    {
         book.setPages(0);
         assertEquals(0,book.getPages());
    }

    @Test
    void testGetAuthor()
    {
        Book book1= new Book(" asdf", 300, "Monika");
        assertNotNull(book.getAuthor());
       assertEquals("Monika",book.getAuthor());
    }

    @Test
    void testSetAuthor()
    {
        book.setAuthor("Thomas");
        assertEquals("Thomas",book.getAuthor());
    }

    @Test
    void testToVerifyMessageCaughtInExceptionSetPages(){
        Exception exception= assertThrows(IllegalArgumentException.class,()->book.setPages(-1));
        assertTrue(exception.getMessage().contains("Pages can't be negative"));
    }
}