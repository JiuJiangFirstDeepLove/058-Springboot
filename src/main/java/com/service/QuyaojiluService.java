package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuyaojiluEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 取退记录 服务类
 */
public interface QuyaojiluService extends IService<QuyaojiluEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}