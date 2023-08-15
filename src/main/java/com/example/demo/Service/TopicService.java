package com.example.demo.Service;

import com.example.demo.Model.Topic;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(101,"UDP","Networking"),
            new Topic(102,"TCP/IP","Networking"),
            new Topic(103,"SDLC","Software Engineering"),
            new Topic(104,"Integration Testing","Software Engineering")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic topic(long id){
        return topics.stream().filter(t -> (t.getId() == id)).findFirst().get();
    }
    public String addTopic(Topic topic){
        this.topics.add(topic);
        return "Successfully Added!";
    }
    public String updateTopic(Topic topic, long id){
        this.topics.add(topic);
        for (int i = 0; i < topics.size(); i++) {
            if (id == topics.get(i).getId()) {
                topics.set(i, topic);
                // deleting an old object of particular data
                topics.remove(i+1);
            }
        }
        return "Successfully Updated!";
    }

    public String deleteTopic(long id){
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId() == id) {
                topics.remove(i);
            }
        }
        return "Deletion Successful!!";
    }
}
