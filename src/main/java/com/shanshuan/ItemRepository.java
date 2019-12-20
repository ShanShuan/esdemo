package com.shanshuan;

import com.shanshuan.pojo.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by wangzifeng on 2019/12/9.
 */
public interface ItemRepository extends ElasticsearchCrudRepository<Item,Long> {
    List<Item> findByPriceBetween(Double start,Double end);
}
