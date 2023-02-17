package com.tunahan.courseapi.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Service ist ein Singleton welches im Controller injected wird
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> topics = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(topics::add);
        return topics;
    }

    public Course getCourse(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        /*
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);

            if(t.getId().equals(id))
                topics.set(i,topic);
        }
         */
        courseRepository.save(course);

    }

    public void deleteCourse(String id) {
        // topics.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}
