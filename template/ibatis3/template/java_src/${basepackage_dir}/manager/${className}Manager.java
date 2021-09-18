<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign tableRemarks = table.remarks>
package ${basepackage}.manager;

import ${basepackage}.dto.${className}DTO;

import java.util.List;

/**
 * @${className}Manager
 * @${tableRemarks}Manager
 * @version :
 */
public interface ${className}Manager {
    /**
     * 插入${className}DTO
     * @param ${classNameLower}DTO
     * @return 主键id
     */
    int insert(${className}DTO ${classNameLower}DTO);
    /**
     * 根据主键id删除${className}DTO
     * @param id
     * @return 删除的行数
     */
    int deleteById(long id);
    /**
     * 根据主键id更新${className}DTO
     * @param ${classNameLower}DTO
     * @return 更新的行数
     */
    int updateById(${className}DTO ${classNameLower}DTO);
    /**
     * 根据主键id查询${className}DTO
     * @param id
     * @return ${className}DTO
     */
    ${className}DTO getOneById(long id);
    /**
     * 根据字段查询${className}DTO
     * @return ${className}DTO
     */
    ${className}DTO getOne(${className}DTO ${classNameLower}DTO);
    /**
     * 根据字段查询List<${className}DTO>
     * @return List<${className}DTO>
     */
    List<${className}DTO> list(${className}DTO ${classNameLower}DTO);

}
