package com.dao;

import com.entity.YaopinChuruInoutEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopinChuruInoutView;

/**
 * 出入库 Dao 接口
 *
 * @author 
 */
public interface YaopinChuruInoutDao extends BaseMapper<YaopinChuruInoutEntity> {

   List<YaopinChuruInoutView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
