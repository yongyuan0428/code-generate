<#include "/macro.include"/> 
<#assign className = table.className>
<#assign tableName = table.sqlName>
<#assign tableRemarks = table.remarks>
<#assign classNameLower = className?uncap_first> 
package ${basepackage};

/**
 * @${className}
 * @${tableRemarks}(${tableName})
 * @version :
 */
public class ${className}DO {

<#list table.columns as column>
	/**
	 * @备注:${column.remarks}
	 * @字段:${column.sqlName} ${column.sqlTypeName}(${column.size})
	 */
	private ${column.javaType} ${column.columnNameLower};

</#list>

<#list table.columns as column>
	public ${column.javaType} get${column.columnName}() {
		return ${column.columnNameLower};
	}
	public void set${column.columnName}(${column.javaType} ${column.columnNameLower}) {
		this.${column.columnNameLower} = ${column.columnNameLower};
	}
</#list>

}