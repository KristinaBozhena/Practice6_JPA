package Practice6_JPA;

public interface LecturesDao {

Lecture addLecture(Lecture lecture);

Lecture getLecture(int id);

void saveLecture(Lecture lecture);

}