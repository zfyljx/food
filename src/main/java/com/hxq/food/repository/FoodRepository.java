package com.hxq.food.repository;

import com.hxq.food.entity.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hxq on 2019/7/5.
 */
public interface FoodRepository extends JpaRepository<Fish,Integer> {

}
