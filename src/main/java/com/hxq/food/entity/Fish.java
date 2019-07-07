/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Fish
 * Author:   hxq
 * Date:     2019/7/5 18:15
 * Description: 菜实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.food.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 〈一句话功能简述〉<br> 
 * 〈菜实体类〉
 *
 * @author hxq
 * @create 2019/7/5
 * @since 1.0.0
 */
@Entity
@Table(name = "fish")
public class Fish {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private Float money;
    private String declified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getDeclified() {
        return declified;
    }

    public void setDeclified(String declified) {
        this.declified = declified;
    }
}

