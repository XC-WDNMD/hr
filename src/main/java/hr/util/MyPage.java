package hr.util;

public class MyPage {

	private Integer page;
	private Integer rows;
	private String sort;
	private String order;
	public MyPage(Integer page, Integer rows, String sort, String order) {
		super();
		this.page = page;
		this.rows = rows;
		this.sort = sort;
		this.order = order;
	}
	public MyPage() {
		super();
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "MyPage [page=" + page + ", rows=" + rows + ", sort=" + sort + ", order=" + order + "]";
	}
	
	
	
}
