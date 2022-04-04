package service;

import com.example.springcertification.service.BlogService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
public class BlogServiceTest {
    @SpyBean
    BlogService blogService;

    @Test
    public void validateGetBlogs()
    {
        List<String> blogs = blogService.getBlogs();
        assertTrue(blogs.contains("blog1"));
    }

    @Test
    public void validateAuthors()
    {
        List<String> authorMockList = List.of("Jack", "Merlin");
        Mockito.when(blogService.getAuthors()).thenReturn(authorMockList);
        List<String> authors = blogService.getAuthors();
        assertTrue(authors.contains("Jack"));
    }
}
