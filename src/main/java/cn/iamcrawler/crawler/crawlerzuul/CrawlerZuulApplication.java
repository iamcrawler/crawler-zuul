package cn.iamcrawler.crawler.crawlerzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class CrawlerZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlerZuulApplication.class, args);
    }
}
