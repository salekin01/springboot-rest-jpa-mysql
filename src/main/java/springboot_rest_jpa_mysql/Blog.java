package springboot_rest_jpa_mysql;

import javax.persistence.*;

@Table(name = "blog")     //This is required if your table name is different from the class name
@Entity     //added for db
public class Blog {

    //@Column(name="title") //This is required if your column name is different from the field name
    @Id     //added for db
    @GeneratedValue(strategy = GenerationType.AUTO)     //added for db
    private int id;
    private String title;
    private String content;

    public Blog() {
    }

    public Blog(String title, String content) {     //added for db
        this.title = title;
        this.content = content;
    }

    public Blog(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
