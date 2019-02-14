package bean;

import java.io.Serializable;
import java.util.Date;

public class Topic implements Serializable{
	Integer topicId;
	Integer boardId;
	Integer userId;
	String title;
	String content;
	String time;
	//多个帖子对应一个版块
	Board board;
	
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public Integer getBoardId() {
		return boardId;
	}
	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", boardId=" + boardId + ", userId=" + userId + ", title=" + title
				+ ", content=" + content + ", time=" + time + ", board=" + board + "]";
	}
	
	
}
