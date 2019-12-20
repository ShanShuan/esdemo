package com.shanshuan;

import com.shanshuan.pojo.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangzifeng on 2019/12/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EsTest {
    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;
@Autowired
ItemRepository itemRepository;

    @Test
    public void test() {
        //创建索引库
        elasticsearchTemplate.createIndex(Item.class);
        //映射关系
        elasticsearchTemplate.putMapping(Item.class);

    }

    @Test
    public void idex() {

//        itemRepository.saveAll();
        List<Item> items=new ArrayList<Item>();
        items.add(new Item(1L,"豪车","车类","bwm",30.5,""));
        items.add(new Item(2L,"豪车","车类","bug",60.5,""));
        items.add(new Item(3L,"豪车","车类","po",90.5,""));
        items.add(new Item(4L,"豪车","车类","rr",130.5,""));
        items.add(new Item(5L,"豪车","车类","bl",230.5,""));
        items.add(new Item(6L,"豪车","车类","lk",330.5,""));
         itemRepository.saveAll(items);
    }

    @Test
    public void findall() {

//        itemRepository.saveAll();

        Iterable<Item> all = itemRepository.findAll();
        for (Item one: all) {
            System.out.println(one.toString());
        }

    }

    @Test
    public void findBy() {
        List<Item> byPriceBetween = itemRepository.findByPriceBetween(60d, 90d);
        for (Item one: byPriceBetween) {
            System.out.println(one.toString());
        }
    }

}
