public class Main
{
	public static void main(String[] args) {
	    Course c = new Course(1, 2, 3, 4); 
	    Team team = new Team("Стрижи", "Петров Иван", "Иванов Петр", "Гринев Петр", "Базаров Евгений", 0); 
		c.doIt(team); 
		team.showResults(); 
		}
}
class Team {
    String title;
    String name1;
    String name2;
    String name3;
    String name4;
    int results;
    public Team(String title, String name1, String name2, String name3, String name4, int results){
        this.title = title;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.results = results;
        }
    public void results(int a){
        results += a;
    }
    public void showResults(){
        System.out.println(name1 + " " + results);
        System.out.println(name2 + " " + results);
        System.out.println(name3 + " " + results);
        System.out.println(name4 + " " + results);
    }
    public void informations() {
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }
}
class Course{
    int course1;
    int course2;
    int course3;
    int course4;
    public Course (int course1, int course2, int course3, int course4){
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
    }
    public void doIt(Team name){
        name.results(4);
    }
}
