package org.student.score.manage.tool;

/**
 * @author ҡ���ֻ�
 * @param pageNow
 *            ��ǰҳ
 * @param pageSize
 *            ÿҳ��ʾ��������¼
 * @param count
 *            �ܹ���������¼
 * @param totalPage
 *            �ܹ�����ҳ
 * @param hasFirst
 *            �Ƿ�����ҳ
 * @param hasPre
 *            �Ƿ���ǰһҳ
 * @param hasNext
 *            �Ƿ�����һҳ
 * @param hasLast
 *            �Ƿ���βҳ
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
		// һ������ҳ���㷨
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
		//�����βҳ������һҳ
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
		// ����������һҳ����βҳ
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
		//�����ǰΪ��ҳ��û�е�һҳ
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
