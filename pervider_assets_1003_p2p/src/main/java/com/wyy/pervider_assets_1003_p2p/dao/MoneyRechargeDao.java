package com.wyy.pervider_assets_1003_p2p.dao;


import com.wyy.common_p2p.entity.assets.MembersAccount;
import com.wyy.common_p2p.entity.assets.MoneyRecharge;
import com.wyy.common_p2p.utils.Query;

import java.util.List;

/**
 * (MoneyRecharge)表数据库访问层
 *
 * @author cpc
 * @since 2019-10-24 19:12:17
 */
public interface MoneyRechargeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MoneyRecharge queryById(Integer id);

    /**
     * 通过query对象查询
     *
     * @param  query 分页查询对象 
     * @return 对象列表
     */
    List<MoneyRecharge> queryPager(Query query);

    /**
     * 新增数据
     *
     * @param moneyRecharge 实例对象
     * @return 影响行数
     */
    int insert(MoneyRecharge moneyRecharge);

    /**
     * 修改数据
     *
     * @param moneyRecharge 实例对象
     * @return 影响行数
     */
    int update(MoneyRecharge moneyRecharge);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    int updateAmount(MembersAccount membersAccount);

}