package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by ling.zhang on 2017/11/27.
 */
public interface SeckillDao {

    //减库存
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    //根据Id查询
    Seckill queryById(long seckillId);

    //查询所有
    List<Seckill> queryAll(@Param("offet") int offet,@Param("limit") int limit);
}
