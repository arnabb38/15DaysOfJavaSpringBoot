package com.arnabb.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("python", "Python 3", "Python 3 Description"),
            new Topic("flutter", "Flutter", "Flutter Description")
    );

    public List<Topic> GetAllTopics()
    {
        return topics;
    }


}
