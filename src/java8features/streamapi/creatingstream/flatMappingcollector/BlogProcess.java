package java8features.streamapi.creatingstream.flatMappingcollector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BlogProcess {

    public static void main(String[] args) {

        List<String> commentList = new ArrayList<String>();
        commentList.add("Nice");
        commentList.add("Very Nice");
        List<String> commentList1 = new ArrayList<String>();
        commentList1.add("Disappointing");
        commentList1.add("OK");
        commentList1.add("Could be better");


        Blog blog1 = new Blog("1", commentList);
        Blog blog2 = new Blog("2", commentList1);

        List<Blog> blogList = new ArrayList<>();
        blogList.add(blog1);
        blogList.add(blog2);

        Map<String,List<List<String>>> authorComments =
                blogList.stream().
                collect(Collectors.groupingBy(Blog::getAuthorName,Collectors
                        .mapping(Blog::getComments,Collectors.toList())));

        authorComments.forEach((k,v)->{
            System.out.println("\n Auther Name: "+k);
            v.forEach(comment->comment.forEach(comment1-> System.out.print(comment1+", ")));
        });
    }






}
