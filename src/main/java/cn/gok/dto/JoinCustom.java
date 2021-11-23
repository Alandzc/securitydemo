package cn.gok.dto;
/**
 * 关联查询实体类(2/3张表)
 * eq(2张表):	select ${fields} from ${table1} left join ${table2} on ${joinFields1} where ${queryConditions}
 * eq(2张表):	select ${fields} from ${table1} left join ${table2} on ${joinFields1} left join ${table3} on ${joinFields2} where ${queryConditions}
 */
public class JoinCustom {
	/**
	 * 查询字段
	 */
	private String fields;
	/**
	 * 表1
	 */
	private String table1;
	/**
	 * 表2
	 */
	private String table2;
	/**
	 * 关联条件1
	 */
	private String	joinFields1;
	/**
	 * 表3
	 */
	private String table3;
	/**
	 * 关联条件2
	 */
	private String joinFields2;
	/**
	 * 查询条件
	 */
	private String queryConditions;
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getTable1() {
		return table1;
	}
	public void setTable1(String table1) {
		this.table1 = table1;
	}
	public String getTable2() {
		return table2;
	}
	public void setTable2(String table2) {
		this.table2 = table2;
	}
	public String getTable3() {
		return table3;
	}
	public void setTable3(String table3) {
		this.table3 = table3;
	}
	public String getJoinFields1() {
		return joinFields1;
	}
	public void setJoinFields1(String joinFields1) {
		this.joinFields1 = joinFields1;
	}
	public String getJoinFields2() {
		return joinFields2;
	}
	public void setJoinFields2(String joinFields2) {
		this.joinFields2 = joinFields2;
	}
	public String getQueryConditions() {
		return queryConditions;
	}
	public void setQueryConditions(String queryConditions) {
		this.queryConditions = queryConditions;
	}
}
