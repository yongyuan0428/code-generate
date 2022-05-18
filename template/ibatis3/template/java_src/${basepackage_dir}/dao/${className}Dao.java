<#assign className = table.className>
        <#assign classNameLower = className?uncap_first>
        <#assign tableRemarks = table.remarks>
        package ${basepackage}.dao;

import ${basepackage}.${className}DO;

import java.util.List;

/**
 * ${className}DAO
 * ${tableRemarks}DAO
 */
public interface ${className}DAO {

    /**
     * 查询List<${className}DO>
     *
     * @param query 筛选条件
     * @return List<${className}DO> 结果集合
     */
    List<${className}DO> list(${className}Query query);

    /**
     * 插入${className}DO
     *
     * @param ${classNameLower}DO ${classNameLower}DO
     * @return 主键id
     */
    int insert(${className}DO ${classNameLower}DO);

    /**
     * 根据主键id更新${className}DO
     *
     * @param ${classNameLower}DO ${classNameLower}DO
     * @return 更新的行数
     */
    int updateById(${className}DO ${classNameLower}DO);

    /**
     * 根据主键id集合批量删除${className}DO
     *
     * @param idList 主键集合
     * @return 删除的行数
     */
    int deleteByIdList(@Param("idList") List<Long> idList);
}
