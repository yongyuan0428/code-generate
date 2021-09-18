<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign tableRemarks = table.remarks>
package ${basepackage}.manager.impl;

import ${basepackage}.dao.${className}Dao;
import ${basepackage}.dto.${className}DTO;
import ${basepackage}.${className}DO;
import ${basepackage}.manager.${className}Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @${className}ManagerImpl
 * @${tableRemarks}ManagerImpl
 * @version :
 */
@Service
public class ${className}ManagerImpl implements ${className}Manager {
    @Autowired
    private ${className}Dao ${classNameLower}Dao;

    @Override
    public int insert(${className}DTO ${classNameLower}DTO) {
        ${className}DO ${classNameLower}DO = ${className}Convert.dto2do(${classNameLower}DTO);
        return ${classNameLower}Dao.insert(${classNameLower}DO);
    }

    @Override
    public int deleteById(long id) {
        return ${classNameLower}Dao.deleteById(id);
    }

    @Override
    public int updateById(${className}DTO ${classNameLower}DTO) {
        ${className}DO ${classNameLower}DO = ${className}Convert.dto2do(${classNameLower}DTO);
        return ${classNameLower}Dao.updateById(${classNameLower}DO);
    }

    @Override
    public ${className}DTO getOneById(long id) {
        ${className}DO ${classNameLower}DO = ${classNameLower}Dao.getOneById(id);
        return ${className}Convert.do2dto(${classNameLower}DO);
    }

    @Override
    public ${className}DTO getOne(${className}DTO ${classNameLower}DTO) {
        ${className}DO ${classNameLower}DO = ${className}Convert.dto2do(${classNameLower}DTO);
        ${className}DO ${classNameLower}DOResult = ${classNameLower}Dao.getOne(${classNameLower}DO);
        return ${className}Convert.do2dto(${classNameLower}DOResult);
    }

    @Override
    public List<${className}DTO> list(${className}DTO ${classNameLower}DTO) {
        ${className}DO ${classNameLower}DO = ${className}Convert.dto2do(${classNameLower}DTO);
        List<${className}DO> ${className}DOList = ${classNameLower}Dao.list(${classNameLower}DO);
        return ${className}Convert.dos2dtos(${className}DOList);
    }

}
