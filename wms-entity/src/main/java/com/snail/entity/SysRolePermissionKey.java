package com.snail.entity;

public class SysRolePermissionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_permission.role_id
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_permission.permission_id
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    private Integer permissionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_permission.role_id
     *
     * @return the value of sys_role_permission.role_id
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_permission.role_id
     *
     * @param roleId the value for sys_role_permission.role_id
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_permission.permission_id
     *
     * @return the value of sys_role_permission.permission_id
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_permission.permission_id
     *
     * @param permissionId the value for sys_role_permission.permission_id
     *
     * @mbggenerated Wed Apr 03 22:44:42 CST 2019
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}