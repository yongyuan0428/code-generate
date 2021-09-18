<#include "/macro.include"/>
<#assign className = table.className>
<#assign tableName = table.sqlName>
<#assign tableRemarks = table.remarks>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.convert;

import org.apache.commons.collections4.CollectionUtils;
import ${basepackage}.${className}DO;
import ${basepackage}.dto.${className}DTO;
import java.util.ArrayList;
import java.util.List;

/**
 * @${className}
 * @${tableRemarks}(${tableName})转换
 * @version :
 */
public class ${className}Convert {

	public static ${className}DO dto2do(${className}DTO ${classNameLower}DTO){
		if (${classNameLower}DTO == null) {
			return null;
		}
		${className}DO ${classNameLower}DO = new ${className}DO();
		<#list table.columns as column>
		${classNameLower}DO.set${column.columnName}(${classNameLower}DTO.get${column.columnName}());
		</#list>
        return ${classNameLower}DO;
	}

	public static ${className}DTO do2dto(${className}DO ${classNameLower}DO){
		if (${classNameLower}DO == null) {
			return null;
		}
		${className}DTO ${classNameLower}DTO = new ${className}DTO();
		<#list table.columns as column>
		${classNameLower}DTO.set${column.columnName}(${classNameLower}DO.get${column.columnName}());
		</#list>
        return ${classNameLower}DTO;
	}

	public static List<${className}DTO> dos2dtos(List<${className}DO> ${classNameLower}DOList){
		if (CollectionUtil.isEmpty(${classNameLower}DOList)) {
			return null;
		}
		List<${className}DTO> list = new ArrayList<>();
		for (${className}DO ${classNameLower}DO : ${classNameLower}DOList) {
		${className}DTO ${classNameLower}DTO = do2dto(${classNameLower}DO);
			list.add(${classNameLower}DTO);
		}
        return list;
	}



}