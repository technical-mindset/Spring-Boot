package com.example.demo.Controller;



import com.example.demo.Model.Topic;
import com.example.demo.Service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {
    @Autowired
    private TopicService topicService;
    @GetMapping
    public List<Topic> getTopics(){
        return topicService.getAllTopics();
    }
    @GetMapping("/{id}")
    public Topic getTopic(@PathVariable("id") long id){
        return topicService.topic(id);
    }
    @PostMapping
    public String addTopic(@RequestBody Topic topic){
       return topicService.addTopic(topic);
    }
    @PutMapping("/{id}")
    public String updateTopic(@RequestBody Topic topic, @PathVariable("id") long id){
       return topicService.updateTopic(topic, id);
    }
    @DeleteMapping("/{id}")
    public String deleteTopic(@PathVariable("id") long id){
        return this.topicService.deleteTopic(id);
    }

}
