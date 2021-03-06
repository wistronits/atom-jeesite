/**
 * Author: obullxl@gmail.com
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.github.obullxl.jeesite.web.result;

import java.util.List;

import com.github.obullxl.jeesite.dal.dto.TopicDTO;
import com.github.obullxl.lang.Paginator;
import com.github.obullxl.lang.biz.BizPageList;

/**
 * 主题分页列表结果
 * 
 * @author obullxl@gmail.com
 * @version $Id: TopicPageList.java, V1.0.1 2013年12月6日 上午9:33:46 $
 */
public class TopicPageList extends BizPageList<TopicDTO> {
    private static final long serialVersionUID = 46054665113739315L;

    /**
     * CTOR
     */
    public TopicPageList(Paginator pager, List<TopicDTO> items) {
        super(pager, items);
    }

}
