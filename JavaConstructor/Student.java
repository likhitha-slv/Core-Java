package JavaConstructor;


	class Student {
		   int id;
		    String name;

		    // Parameterized constructor
		    Student(int id, String name) {
		        this.id = id;
		        this.name = name;
		    }

		    // Copy constructor
		    Student(Student s) {
		        this.id = s.id;
		        this.name = s.name;
		    }

		    public static void main(String[] args) {
		        Student s1 = new Student(10, "Likhitha");
		        Student s2 = new Student(s1);

		        System.out.println("S1: " + s1.id + " " + s1.name);
		        System.out.println("S2: " + s2.id + " " + s2.name);
		    }
		}

