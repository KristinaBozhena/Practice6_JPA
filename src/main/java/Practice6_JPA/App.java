package Practice6_JPA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Lecture lecture = new Lecture();
		lecture.setName("Introduction to Spring");
		lecture.setCredits(2.5);
		Lecture lecture1 = new Lecture();
		lecture1.setName("Spring");
		lecture1.setCredits(2);
		LecturesWorker worker = (LecturesWorker) context.getBean("worker");
	//	worker.addLecture(lecture);
		worker.addLecture(lecture1);
	}
}
