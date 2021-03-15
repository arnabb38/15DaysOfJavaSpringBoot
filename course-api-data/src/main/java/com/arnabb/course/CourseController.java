package com.arnabb.course;

import com.arnabb.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    // GET request
    @RequestMapping("/topics/{id}/courses")
    public List<Course> GetAllCourses(@PathVariable String id)
    {
        return courseService.GetAllCourses(id);
    }

    // GET request
    @RequestMapping("/topics/{TopicId}/courses/{id}")
    public Course getCourse(@PathVariable String id)
    {
        return courseService.getCourse(id);
    }

    // POST request
    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId)
    {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    // PUT request
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId)
    {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(id, course);
    }

    // DELETE request
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id)
    {
        courseService.deleteCourse(id);
    }
}
