package com.wyy.pervider_user_1001_p2p.dao;


import com.wyy.common_p2p.entity.members.Members;
import com.wyy.common_p2p.utils.Query;

import java.util.List;

/**
 * (Members)表数据库访问层
 *
 * @author cpc
 * @since 2019-10-25 16:10:56
 */
public interface MembersDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Members queryById(Integer id);


    /**
     * 登录验证
     * @param mebers
     * @return
     */
    Members login(Members mebers);

    /**
     * 通过query对象查询
     *
     * @param  query 分页查询对象 
     * @return 对象列表
     */
    List<Members> queryPager(Query query);

    /**
     * 新增数据
     *
     * @param members 实例对象
     * @return 影响行数
     */
    int insert(Members members);

    /**
     * 修改数据
     *
     * @param members 实例对象
     * @return 影响行数
     */
    int update(Members members);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);


    Integer getMaxId();


    /**
     * 会员信息初始化(这是会员信息表)
     * @param membersId 会员id
     * @return
     */
    Integer initMembersDetail(Integer membersId);

    /**
     * 这是初始化会员账户表
     * @param membersId 这是会员id
     * @return
     */
    Integer initMembersAccount(Integer membersId);
}