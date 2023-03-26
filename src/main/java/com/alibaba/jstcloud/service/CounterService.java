package com.alibaba.jstcloud.service;

import com.alibaba.jstcloud.dto.Counter;

/**
 * the counter service
 * contains: increment and decrement operation
 *
 * @author daiqixiang.dqx@alibaba-inc.com
 * @since 2023/03/19
 */
public interface CounterService {

    /**
     * get the current count
     * @return the current count
     */
    Counter get();

    /**
     * increment the counter
     * @return the current count
     */
    Counter increment();

    /**
     * decrement the counter
     * @return the current count
     */
    Counter decrement();

}
