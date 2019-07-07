/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FoodController
 * Author:   hxq
 * Date:     2019/7/5 18:23
 * Description: 菜的控制类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hxq.food.controller;

import com.hxq.food.entity.Fish;
import com.hxq.food.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * 〈一句话功能简述〉<br> 
 * 〈菜的控制类〉
 *
 * @author hxq
 * @create 2019/7/5
 * @since 1.0.0
 */
@RestController
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;

    /**
     * 找到所有的菜品
     * @return
     */
    @GetMapping(value = "/fish")
    public List<Fish> findAllFood(){
        return foodRepository.findAll();
    }

    @GetMapping(value = "/fish/{id}")
    public Optional<Fish> findOne(@PathVariable("id")Integer id){
        Fish fish=new Fish();
        fish.setId(id);
        Example<Fish> example=Example.of(fish);
        return foodRepository.findOne(example);
    }
    /**
     * 添加一个菜品
     * @param name
     * @param money
     * @param declified
     * @return
     */
    @PostMapping(value = "/fish")
    public Fish addOne(@RequestParam("name")String name,
                       @RequestParam("money")Float money,
                       @RequestParam("declified")String declified){
        Fish fish=new Fish();
        fish.setMoney(money);
        fish.setName(name);
        fish.setDeclified(declified);

        return foodRepository.save(fish);

    }

    /**
     * 更新一个菜品
     * @param id
     * @param name
     * @param money
     * @param declified
     * @return
     */
    @PutMapping(value = "/fish/{id}")
    public Fish updateFish(@PathVariable("id")Integer id,
                       @RequestParam("name")String name,
                       @RequestParam("money")Float money,
                       @RequestParam("declified")String declified){
        Fish fish=new Fish();
        fish.setMoney(money);
        fish.setId(id);
        fish.setName(name);
        fish.setDeclified(declified);
        return foodRepository.save(fish);
    }

    /**
     * 根据idd删除一个菜品
     * @param id
     */
    @DeleteMapping(value = "/fish/{id}")
    public void deleteFish(@PathVariable("id")Integer id){
        Fish fish=new Fish();
        fish.setId(id);
        foodRepository.delete(fish);

    }


}

