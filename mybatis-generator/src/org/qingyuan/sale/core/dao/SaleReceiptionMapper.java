package org.qingyuan.sale.core.dao;

import org.qingyuan.sale.core.model.SaleReceiption;

public interface SaleReceiptionMapper {
    int deleteByPrimaryKey(Integer sn);

    int insert(SaleReceiption record);

    int insertSelective(SaleReceiption record);

    SaleReceiption selectByPrimaryKey(Integer sn);

    int updateByPrimaryKeySelective(SaleReceiption record);

    int updateByPrimaryKey(SaleReceiption record);
}