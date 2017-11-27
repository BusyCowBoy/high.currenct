package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * Created by ling.zhang on 2017/11/27.
 */
public interface SuccessSeckilledDao {

    //插入购买明细，可过滤重复
    int insertSuccessKilled(long seckillId,long userPhone);

    //
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
