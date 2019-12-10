package com.shanshuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * Created by wangzifeng on 2019/12/9.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(indexName = "wangzifeng",type = "item",shards = 1)
public class Item {
    @Id
    @Field(type = FieldType.Long)
    Long id;
    @Field(type =FieldType.Text,analyzer = "ik_smart")
    String title;//标题
    @Field(type =FieldType.Keyword)
    String category;//分类
    @Field(type =FieldType.Keyword)
    String brand;//品牌
    @Field(type =FieldType.Double)
    Double price;
    @Field(type =FieldType.Keyword,index=false)
    String images;
}
