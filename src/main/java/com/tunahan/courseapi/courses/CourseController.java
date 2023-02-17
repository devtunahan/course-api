package com.tunahan.courseapi.courses;

import com.tunahan.courseapi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class CourseController {

    @Autowired
    private CourseService courseService;
    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourses(id);
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
    @RequestMapping("/topics/{topicId}/courses/{courseId}")
    public Course getCourse(@PathVariable("courseId") String id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{topicId}/courses/{id}")
    public void deleteTopic(@PathVariable String id) {
         courseService.deleteCourse(id);
    }

}
