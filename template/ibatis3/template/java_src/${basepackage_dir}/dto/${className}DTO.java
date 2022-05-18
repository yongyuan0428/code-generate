<#include "/macro.include"/>
<#assign className = table.className>
<#assign tableName = table.sqlName>
<#assign tableRemarks = table.remarks>
<#assign classNameLower = className?uncap_first>
		package ${basepackage}.dto;

/**
 * ${className}
 * ${tableRemarks}
 */
@Data
public class ${className}DTO {

<#list table.columns as column>
	/**
	 * ${column.remarks}
	 */
	private ${column.simpleJavaType} ${column.columnNameLower};
</#list>
}