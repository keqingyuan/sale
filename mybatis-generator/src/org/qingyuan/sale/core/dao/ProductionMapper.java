package org.qingyuan.sale.core.dao;

import org.qingyuan.sale.core.model.Production;

public interface ProductionMapper {
    int deleteByPrimaryKey(Integer sn);

    int insert(Production record);

    int insertSelective(Production record);

    Production selectByPrimaryKey(Integer sn);

    int updateByPrimaryKeySelective(Production record);

    int updateByPrimaryKey(Production record);
}