package com.hmdp.service;

import com.hmdp.dto.Result;
import com.hmdp.entity.ShopType;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XU
 * @since 2023-12-22
 */
public interface IShopTypeService extends IService<ShopType> {

    Result queryList();
}
