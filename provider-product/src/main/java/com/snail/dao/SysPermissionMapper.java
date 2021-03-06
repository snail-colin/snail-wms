package com.snail.dao;

import com.snail.entity.SysPermission;
import com.snail.entity.SysPermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    int countByExample(SysPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    int deleteByExample(SysPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    int insert(SysPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    int insertSelective(SysPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    List<SysPermission> selectByExample(SysPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    SysPermission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    int updateByPrimaryKeySelective(SysPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    int updateByPrimaryKey(SysPermission record);
}