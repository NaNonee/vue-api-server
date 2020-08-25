package com.vueapiserver.shop.common.page;


import com.vueapiserver.shop.utils.ServletUtils;
import org.springframework.beans.factory.annotation.Value;

/**
 * 表格数据处理
 * 
 * @author ruoyi
 */
public class TableSupport
{
    /**
     * 当前记录起始索引
     */
    public static  String PAGE_NUM ;

    /**
     * 每页显示记录数
     */
    public static  String PAGE_SIZE ;

    /**
     * 排序列
     */
    public static  String ORDER_BY_COLUMN ;

    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    public static  String IS_ASC ;

    @Value("${page.pageNum}")
    public  void setPageNum(String pageNum) {
        PAGE_NUM = pageNum;
    }
    @Value("${page.pageSize}")
    public  void setPageSize(String pageSize) {
        PAGE_SIZE = pageSize;
    }
    @Value("${page.orderByColumn}")
    public  void setOrderByColumn(String orderByColumn) {
        ORDER_BY_COLUMN = orderByColumn;
    }
    @Value("${page.isAsc}")
    public  void setIsAsc(String isAsc) {
        IS_ASC = isAsc;
    }

    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain()
    {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(ORDER_BY_COLUMN));
        pageDomain.setIsAsc(ServletUtils.getParameter(IS_ASC));
        return pageDomain;
    }

    public static PageDomain buildPageRequest()
    {
        return getPageDomain();
    }
}
