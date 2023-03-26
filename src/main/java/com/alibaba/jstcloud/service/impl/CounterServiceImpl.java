package com.alibaba.jstcloud.service.impl;

import com.alibaba.jstcloud.dao.CounterMapper;
import com.alibaba.jstcloud.dto.Counter;
import com.alibaba.jstcloud.service.CounterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * the implement of the counter service
 *
 * @author daiqixiang.dqx@alibaba-inc.com
 * @since 2023/03/19
 */
@Service
public class CounterServiceImpl implements CounterService {

    @Resource
    private CounterMapper counterMapper;

    @Override
    public Counter get() {
        Counter counter = counterMapper.select();
        if(counter == null){
            counter = new Counter();
            counter.setCount(0);
            counter.setGmtCreated(new Date());
            counter.setGmtModified(new Date());
            counterMapper.insert(counter);
        }

        return counter;
    }

    @Override
    public Counter increment() {
        Counter counter = counterMapper.select();
        if(counter == null){
            counter = new Counter();
            counter.setCount(1);
            counter.setGmtCreated(new Date());
            counter.setGmtModified(new Date());
            counterMapper.insert(counter);
        }else{
            counter.setCount(counter.getCount() + 1);
            counterMapper.update(counter);
        }

        return counter;
    }

    @Override
    public Counter decrement() {
        Counter counter = counterMapper.select();
        if(counter == null){
            counter = new Counter();
            counter.setCount(1);
            counter.setGmtCreated(new Date());
            counter.setGmtModified(new Date());
            counterMapper.insert(counter);
        }else{
            counter.setCount(counter.getCount() - 1);
            counterMapper.update(counter);
        }

        return counter;
    }
}
