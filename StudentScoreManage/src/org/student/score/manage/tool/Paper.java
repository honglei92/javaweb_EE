package org.student.score.manage.tool;

/**
 * @author 摇滚轮回
 * @param pageNow
 *            当前页
 * @param pageSize
 *            每页显示多少条记录
 * @param count
 *            总共多少条记录
 * @param totalPage
 *            总共多少页
 * @param hasFirst
 *            是否有首页
 * @param hasPre
 *            是否有前一页
 * @param hasNext
 *            是否有下一页
 * @param hasLast
 *            是否有尾页
 * 
 */

public class Paper {

	private int pageNow;
	private int pageSize = 8;
	private int count;
	private int totalPage;
	@SuppressWarnings("unused")
	private boolean hasPre;
	@SuppressWarnings("unused")
	private boolean hasNext;
	@SuppressWarnings("unused")
	private boolean hasLast;
	@SuppressWarnings("unused")
	private boolean hasFirst;
	
	public Paper(int pageNow,int count) {
		this.pageNow = pageNow;
		this.count = count;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalPage() {
		// 一共多少页的算法
		totalPage = getCount() / getPageSize();
		if (count % pageSize != 0) {
			totalPage++;
		}
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public boolean isHasPre() {
		if (this.isHasFirst()) {
			return true;
		} else {
			return false;
		}
	}

	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}

	public boolean isHasNext() {
		//如果有尾页就有下一页
		if (this.isHasLast()) {
			return true;
		} else {
			return false;
		}
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public boolean isHasLast() {
		// 如果不是最后一页就有尾页
		if (pageNow == this.getTotalPage()) {
			return true;
		} else {
			return false;
		}
	}

	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}

	public boolean isHasFirst() {
		//如果当前为首页就没有第一页
		if (pageNow == 1) {
			return false;
		} else {
			return true;
		}
	}

	public void setHasFirst(boolean hasFirst) {
		this.hasFirst = hasFirst;
	}
}
