package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import bean.Board;

public interface BoardDao {
	//————————————————————————————————————————————————查询——————————————————————————————————————————————————————————————————————————————
	/**
	 * 根据id号来查询Board
	 * @param id
	 * @return Board
	 */
	public Board findBoardById(int id);
	/**
	 * 查询所有版块
	 * @return
	 */
	public List<Board> findAllBoard();
	/**
	 * 根据版块名字和版块标记来查找版块
	 * @param name
	 * @param reamark
	 * @return
	 */
	public List<Board> findBoardByNameAndRemark(@Param("boardName") String boardName, @Param("remark")String reamark);
	//————————————————————————————————————————————————插入——————————————————————————————————————————————————————————————————————————————
	/**
	 * 插入一个新的board
	 * @param board
	 */
	public void insertBoard(Board board);
	//————————————————————————————————————————————————更新——————————————————————————————————————————————————————————————————————————————
	/**
	 * 更新一个版块
	 * @param board
	 */
	public void updateBoard(Board board);
	//————————————————————————————————————————————————删除——————————————————————————————————————————————————————————————————————————————
	/**
	 * 删除id号为id的版块
	 * @param id
	 */
	public void deleteBoard(int id);
	/**
	 * 批量删除
	 * @param boardIdList
	 */
	public int deleteBoardList(List boardIdList);
	//—————————————————————————————————————————————动态SQL:If——————————————————————————————————————————————————————————————————————————————
	/**
	 * If动态sql查询
	 * @param board
	 * @return
	 */
	public List<Board> findBoardByIf(Board board);
	//—————————————————————————————————————————————动态SQL:choose——————————————————————————————————————————————————————————————————————————————
	/**
	 * Choose when otherwise动态sql查询
	 * @param board
	 * @return
	 */
	public List<Board> findBoardByChoose(Board board);
	//—————————————————————————————————————————————动态SQL:trim——————————————————————————————————————————————————————————————————————————————
	/**
	 * trim格式化标签
	 * @param board
	 * @return
	 */
	public List<Board> findBoardByTrim(Board board);
	//—————————————————————————————————————————————动态SQL:where——————————————————————————————————————————————————————————————————————————————
	/**
	 * where标签
	 * @param board
	 * @return
	 */
	public List<Board> findBoardByWhere(Board board);
	
}
