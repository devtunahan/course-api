package com.tunahan.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


/**
 * GET  /topics Get all topics
 * GET  /topics/id  Gets the topic
 *
 * POST /topics Create new topic
 *
 * PUT  /topics/id  Updates the topic
 *
 * DELETE   /topics/id    Deletes the topic
 */
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }


    /**
     * Wird auch funktionieren
     *
     *  RequestMapping("/topics/{foo}")
     *     public Topic getTopic(@PathVariable("foo") String id) {
     *         return topicService.getTopic(id);
     *     }
     *
     */
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
         topicService.deleteTopic(id);
    }

}
