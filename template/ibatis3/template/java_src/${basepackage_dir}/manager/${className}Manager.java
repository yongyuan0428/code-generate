<#assign className = table.className>
        <#assign classNameLower = className?uncap_first>
        <#assign tableRemarks = table.remarks>
        package ${basepackage}.manager;

import ${basepackage}.dto.${className}DTO;

import java.util.List;

public interface ${className}Manager {

    /**
     * 根据字段查询List<${className}DTO>
     *
     * @param query 筛选条件
     * @return List<${className}DTO> 结果集合
     */
    List<${className}DTO> list(${className}Query query);

    /**
     * 新增${className}DTO
     *
     * @param ${classNameLower}DTO 新增DTO
     */
    void insert(${className}DTO ${classNameLower}DTO);

    /**
     * 根据主键id更新${className}DTO
     *
     * @param ${classNameLower}DTO 更新DTO
     */
    void updateById(${className}DTO ${classNameLower}DTO);

    /**
     * 根据主键id集合批量删除${className}DTO
     *
     * @param idList 主键集合
     */
    void deleteByIdList(List<Long> idList);

}
