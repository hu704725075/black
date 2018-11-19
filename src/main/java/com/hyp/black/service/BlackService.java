package com.hyp.black.service;

import com.hyp.black.util.DBUtil;
import com.hyp.black.vo.Params;
import org.springframework.stereotype.Service;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 14:05 2018/11/17
 */
@Service
public class BlackService {

    public String createTemplete(Params params){
        return DBUtil.createTemplete(params);
    }
}