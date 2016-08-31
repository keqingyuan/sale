package org.qingyuan.sale.core.dao;

import org.qingyuan.sale.core.model.ProductionCategory;

public interface ProductionCategoryMapper {
    int deleteByPrimaryKey(Integer sn);

    int insert(ProductionCategory record);

    int insertSelective(ProductionCategory record);

    ProductionCategory selectByPrimaryKey(Integer sn);

    int updateByPrimaryKeySelective(ProductionCategory record);

    int updateByPrimaryKey(ProductionCategory record);
}