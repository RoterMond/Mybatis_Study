package bean;

import java.io.Serializable;

public class Board implements Serializable{
	Integer boardId;
	String boardName;
	String remark;
	
	public Integer getBoardId() {
		return boardId;
	}
	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Board [boardId=" + boardId + ", boardName=" + boardName + ", remark=" + remark + "]";
	}
	
	
}
