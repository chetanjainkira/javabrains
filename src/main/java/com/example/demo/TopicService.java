package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<topics> topics = new ArrayList<>( Arrays.asList(
            new topics("java1" , "topic1" , "qwertyuiosdfghj"),
            new topics("javaScript2","topic2","wertyuqwert"),
            new topics("net3","topic3","wertyuqwjjjert")

    ));


    public List<topics> getAllTopics()
    {
        return topics;
    }

    public topics getTopic(String id){
           return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(topics topic) {
        topics.add(topic);
    }

    public void updateTopic(String id , topics topic ){
        for (int i =0 ; i < topics.size() ; i++){
            topics t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i , topic);
                return;
            }

        }
    }


}
