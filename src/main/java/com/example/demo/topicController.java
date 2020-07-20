package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class topicController {

        @Autowired
        private TopicService topicService;


        @RequestMapping("/topics")
        public List<topics> getAllTopics(){
            return topicService.getAllTopics();
        }

        @RequestMapping("/topics/{id}")
        public topics getTopic(@PathVariable String id){
            return topicService.getTopic(id);
        }

        @RequestMapping(method = RequestMethod.POST , value = "/topics")
        public void addTopic(@RequestBody topics topic){
            topicService.addTopic(topic);
        }

        @RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
        public void updateTopic(@RequestBody topics topic , @PathVariable String id){
            topicService.updateTopic( id , topic);
        }

}
