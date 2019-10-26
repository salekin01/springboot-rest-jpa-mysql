package springboot_rest_jpa_mysql;

import java.util.ArrayList;
import java.util.List;

public class BlogMockedData {

    private static BlogMockedData instance = null; //singleton
    private List<Blog> blogs;

    public static BlogMockedData getInstance() {
        if(instance == null){
            instance = new BlogMockedData();
        }
        return instance;
    }

    public BlogMockedData(){
        blogs = new ArrayList<Blog>();
        blogs.add(new Blog(1, "title1", "content1" ));
        blogs.add(new Blog(2, "title2", "content2" ));
        blogs.add(new Blog(3, "title3", "content3" ));
        blogs.add(new Blog(4, "title4", "content4" ));
        blogs.add(new Blog(5, "title5", "content5" ));
    }

    public List<Blog> fetchBlogs(){
        return blogs;
    }

    public Blog getBlogById(int id) {
        for(Blog b: blogs) {
            if(b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public List<Blog> searchBlogs(String searchTerm) {
        List<Blog> searchedBlogs = new ArrayList<Blog>();
        for(Blog b: blogs) {
            if(b.getTitle().toLowerCase().contains(searchTerm.toLowerCase()) ||
                    b.getContent().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchedBlogs.add(b);
            }
        }

        return searchedBlogs;
    }

    public Blog createBlog(int id, String title, String content) {
        Blog newBlog = new Blog(id, title, content);
        blogs.add(newBlog);
        return newBlog;
    }

    public Blog updateBlog(int id, String title, String content) {
        for(Blog b: blogs) {
            if(b.getId() == id) {
                int blogIndex = blogs.indexOf(b);
                b.setTitle(title);
                b.setContent(content);
                blogs.set(blogIndex, b);
                return b;
            }
        }
        return null;
    }

    public boolean delete(int id){
        int blogIndex = -1;
        for(Blog b: blogs) {
            if(b.getId() == id) {
                blogIndex = blogs.indexOf(b);
                continue;
            }
        }
        if(blogIndex > -1){
            blogs.remove(blogIndex);
        }
        return true;
    }
}
