package com.lihaiqiao.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lihaiqiao.gulimall.common.utils.PageUtils;
import com.lihaiqiao.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author lihaiqiao
 * @email lihaiqiao@gmail.com
 * @date 2020-11-21 20:20:24
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

