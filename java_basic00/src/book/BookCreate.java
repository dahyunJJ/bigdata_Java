package book;

import java.util.Scanner;

public class BookCreate {
	
	private static Scanner sc = new Scanner(System.in);

	public static void bookinfoInsert() {
		
		// 도서 정보를 입력 받아 Book1을 만들어 보세요.
		
		System.out.println("도서명을 입력해 주세요 : ");
		String bookTitle = sc.next();
		
		System.out.println("도서 가격을 입력해 주세요 : ");
		int bookPrice = sc.nextInt();
		
		System.out.println("도서의 저자를 입력해 주세요 : ");
		String bookAuth = sc.next();
		
		System.out.println("출판사를 입력해 주세요 : ");
		String bookPub = sc.next();
		
		System.out.println("출판년도를 입력해 주세요 : ");
		String bookPubYear = sc.next();
		
		System.out.println("도서 ISBN 코드를 입력해 주세요 : ");
		String bookIsbn = sc.next();
		
		System.out.println("총 페이지수를 입력해 주세요 : ");
		int bookPage = sc.nextInt();
		
		
		sc.close();
		
		
		Book b1 = new Book();
		
		b1.setTitle(bookTitle);
		b1.setPrice(bookPrice);
		b1.setAuthor(bookAuth);
		b1.setPublisher(bookPub);
		b1.setPubYear(bookPubYear);
		b1.setIsbn(bookIsbn);
		b1.setPage(bookPage);
		
		bookInfoSelect(b1);

	}
	
	public static Book bookInfoSelect (Book book) {
		System.out.println(book.BookInfo());
		
		return book;
	}

}
