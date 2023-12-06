package com.dao;

import com.entity.QuyaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QuyaojiluView;

/**
 * 取退记录 Dao 接口
 *
 * @author 
 */
public interface QuyaojiluDao extends BaseMapper<QuyaojiluEntity> {

   List<QuyaojiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
