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

@Service("${classNameLower}Manager")
public class ${className}ManagerImpl implements ${className}Manager {

@Autowired
private ${className}DAO ${classNameLower}DAO;

@Override
public List<${className}DTO> list(${className}DTO ${classNameLower}DTO) {
        ${className}DO ${classNameLower}DO = ${className}Convert.dto2do(${classNameLower}DTO);
        List<${className}DO> ${className}DOList = ${classNameLower}DAO.list(${classNameLower}DO);
        return ${className}Convert.dos2dtos(${className}DOList);
        }

@Override
public void insert(${className}DTO ${classNameLower}DTO) {
        int i = ${classNameLower}DAO.insert(${className}Convert.dto2do(${classNameLower}DTO));
        if (i <= 0) {
        throw new Exception("新增${className}DO失败~");
        }
        }

@Override
public void deleteByIdList(List<Long> idList) {
        int i = ${classNameLower}DAO.deleteByIdList(idList);
        if (i <= 0) {
        throw new Exception("根据主键集合删除${className}失败~");
        }
        }

@Override
public void updateById(${className}DTO ${classNameLower}DTO) {
        int i = ${classNameLower}DAO.updateById(${className}Convert.dto2do(${classNameLower}DTO))
        if (i <= 0) {
        throw new Exception("根据主键更新${className}失败~");
        }
        }
        }
