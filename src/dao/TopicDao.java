package dao;

import java.util.List;
import bean.Topic;

public interface TopicDao {
	public List<Topic> findAllTopicBoardName();
	
	public Topic findTopicByStep(int id);
}
