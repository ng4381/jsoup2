package main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        File htmlFile = new File("C:\\project\\index.html");
        System.out.println("file exists: " + htmlFile.exists() + " path: " + htmlFile.getPath());
        Document doc = Jsoup.parse(htmlFile, "UTF-8");



        String cssQuery = "[id$=k2]";
        cssQuery = ".myclass";
        cssQuery = "#nik1";
        cssQuery = "tr.trclass";
        cssQuery = "tr[id=nik2].trclass";
        cssQuery = ".myclass2 tr[id*=nik]";

        cssQuery = "table>tbody>tr>td#n1[href*=qwe]";
        cssQuery = "table>tbody>tr>td#n1, [href=qwe]";

        cssQuery = "td:contains(Password)";

        cssQuery = "td:matches(Password[\\d]{1,3}\\b)";

        //cssQuery = "td:contains(Pass)";





        Elements elements = doc.select(cssQuery);

        elements.stream().forEach(System.out::println);



        /*

        Element form = doc.getElementById("registerForm");
        System.out.println(form.attr("action"));

        Elements inputElements = form.getElementsByTag("input");

        for(Element inputElement : inputElements){
            System.out.println(inputElement.attr("name"));
            System.out.println(inputElement.attr("value"));
        }

        Elements aElements = form.getElementsByTag("a");
        aElements.stream().forEach(x-> System.out.println("href: " + x.attr("href") + " text: " +x.text() ));

        String title = doc.title();
        System.out.println(title);

         */
    }
}
