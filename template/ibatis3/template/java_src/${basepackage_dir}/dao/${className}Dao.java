<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign tableRemarks = table.remarks>
package ${basepackage}.dao;

import org.springframework.stereotype.Repository;
import ${basepackage}.${className}DO;

import java.util.List;

/**
 * @${className}Dao
 * @${tableRemarks}Dao
 * @version :
 */
@Repository
public interface ${className}Dao {
    /**
     * 插入${className}DO
     * @param ${classNameLower}DO
     * @return 主键id
     */
    int insert(${className}DO ${classNameLower}DO);
    /**
     * 根据主键id删除${className}DO
     * @param id
     * @return 删除的行数
     */
    int deleteById(long id);
    /**
     * 根据主键id更新${className}DO
     * @param ${classNameLower}DO
     * @return 更新的行数
     */
    int updateById(${className}DO ${classNameLower}DO);
    /**
     * 根据主键id查询${className}DO
     * @param id
     * @return ${className}DO
     */
    ${className}DO getOneById(long id);
    /**
     * 根据字段查询${className}DO
     * @return ${className}DO
     */
    ${className}DO getOne(${className}DO ${classNameLower}DO);
    /**
     * 根据字段查询List<${className}DO>
     * @return List<${className}DO>
     */
    List<${className}DO> list(${className}DO ${classNameLower}DO);
}
