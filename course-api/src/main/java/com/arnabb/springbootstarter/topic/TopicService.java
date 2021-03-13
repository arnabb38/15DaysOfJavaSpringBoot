package com.arnabb.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    // Array.asList is immutable, can't be manipulated (add or delete)
    // ArrayList<> added to give it mutability and passes Array.asList as an object
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("python", "Python 3", "Python 3 Description"),
            new Topic("flutter", "Flutter", "Flutter Description")
    ));

    public List<Topic> GetAllTopics()
    {
        return topics;
    }

    public Topic getTopic(String id)
    {
        return topics.stream().filter(t -> t.getId()
                .equals(id))
                .findFirst()
                .get();
    }


    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for(int i = 0; i<topics.size(); i++)
        {
            Topic t = topics.get(i);
            if(t.getId().equals(id))
            {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
