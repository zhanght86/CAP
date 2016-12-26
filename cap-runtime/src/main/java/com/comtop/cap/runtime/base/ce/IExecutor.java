/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/

package com.comtop.cap.runtime.base.ce;

/**
 * 实体执行接口
 *
 * @author 龚斌
 * @since 1.0
 * @version 2015年9月29日 龚斌
 */
public interface IExecutor {
    
    // void action();
    
    /**
     * 新增
     */
    void insert();
    
    /**
     * 读取
     */
    void loadById();
    
    /**
     * 删除
     */
    void delete();
}
