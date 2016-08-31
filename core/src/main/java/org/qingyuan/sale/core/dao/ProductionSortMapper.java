package org.qingyuan.sale.core.dao;

import org.qingyuan.sale.core.model.ProductionSort;

public interface ProductionSortMapper {
    int deleteByPrimaryKey(Integer sn);

    int insert(ProductionSort record);

    int insertSelective(ProductionSort record);

    ProductionSort selectByPrimaryKey(Integer sn);

    int updateByPrimaryKeySelective(ProductionSort record);

    int updateByPrimaryKey(ProductionSort record);
}