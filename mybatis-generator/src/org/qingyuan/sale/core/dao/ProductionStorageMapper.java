package org.qingyuan.sale.core.dao;

import org.qingyuan.sale.core.model.ProductionStorage;

public interface ProductionStorageMapper {
    int deleteByPrimaryKey(Integer sn);

    int insert(ProductionStorage record);

    int insertSelective(ProductionStorage record);

    ProductionStorage selectByPrimaryKey(Integer sn);

    int updateByPrimaryKeySelective(ProductionStorage record);

    int updateByPrimaryKey(ProductionStorage record);
}