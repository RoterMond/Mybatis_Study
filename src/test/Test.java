package test;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.Board;
import bean.Topic;
import dao.BoardDao;
import dao.TopicDao;

public class Test {
	public static void main(String[] args) throws IOException {
		// mybatis配置文件
		String resource = "mybatis_config.xml";
		// 获取当前配置文件的输入流
		Reader reader = Resources.getResourceAsReader(resource);
		// 通过流对象来创建SqlSessionFactory数据库会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		// 通过数据库会话工厂来开启一次数据库的会话 true表示自动提交，默认为false
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		// 获取dao映射对象
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		TopicDao topicDao = sqlSession.getMapper(TopicDao.class);
		// 查询单一
		/*
		 * Board board = dao.findBoardById(1); 
		 * System.out.println(board.getBoardName());
		 */

		// 查询全部
		/*
		 * List<Board> boardList = dao.findAllBoard();
		 * System.out.println(boardList.size());
		 */

		// 多参数查询
		/*
		 * List<Board> boardList = dao.findBoardByNameAndRemark("格", "格");
		 * System.out.println(boardList.size());
		 */

		// 插入
		/*
		 * Board board = new Board(); 
		 * board.setBoardName("11"); 
		 * board.setRemark("11");
		 * dao.insertBoard(board);
		 */

		// 更新
		/*
		 * Board board = new Board(); 
		 * board.setBoardName("hh");
		 * board.setRemark("what went wrong"); 
		 * board.setBoardId(12);
		 * dao.updateBoard(board);
		 */

		// 删除
		/* dao.deleteBoard(12); */

		// 动态SQL——————————————————————————————————————————————————————————————————————————————————————

		// if标签
		/*
		 * Board board = new Board(); 
		 * board.setBoardName("格"); List<Board> boardList =
		 * dao.findBoardByIf(board); 
		 * System.out.println(boardList.size());
		 */

		// choose标签
		/*
		 * Board board = new Board(); 
		 * board.setBoardName("格");
		 * board.setRemark("真");
		 * List<Board> boardList = dao.findBoardByChoose(board);
		 * System.out.println(boardList.size());
		 */

		// trim标签
		/*
		 * Board board = new Board(); 
		 * board.setBoardName("格");
		 * board.setRemark("真");
		 * List<Board> boardList = dao.findBoardByTrim(board);
		 * System.out.println(boardList.size());
		 */

		// where标签
		/*
		 * Board board = new Board(); 
		 * board.setBoardName("格");
		 * board.setRemark("真");
		 * List<Board> boardList = dao.findBoardByWhere(board);
		 * System.out.println(boardList.size());
		 */

		// 批量删除
		/*List list = new ArrayList();
		list.add(12);
		list.add(13);	
		int count = dao.deleteBoardList(list);
		System.out.println(list);
		System.out.println(count);*/
		
		// 多表联合查询 resultMap
		/*List<Topic> topicList = topicDao.findAllTopicBoardName(); 
		System.out.println(topicList.size());*/
		
		//分步查询
		/*Topic topic = new Topic();
		topic = topicDao.findTopicByStep(20);
		System.out.println(topic);*/
		
		//分步查询+延迟加载
		/*Topic topic = new Topic();
		topic = topicDao.findTopicByStep(20);
		System.out.println(topic.getTopicId());*/
		
	}
}
