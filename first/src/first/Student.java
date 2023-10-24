package first;

public class Student {
	
    private String firstName;
    private String lastName;
    private String StudentNumber;
    private double courseAverage;
   
   
  public Student(String  firstName , String lastName,String StudentNumber, double courseAverage) {
	  this.firstName =  firstName; 
	  this.lastName= lastName;
	  this.StudentNumber = StudentNumber;
	  this.courseAverage = courseAverage;   
  
  }
  
  public String getFirstName() {
      return firstName;
  }
  
  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }
  
  public String getLastName() {
      return lastName;
  }
  
  public void setLastName(String lastName) {
	  this.lastName= lastName;
  }
  
  public String getStudentNumber() {
      return StudentNumber;
  }
  
  public void setStudentNumber(String StudentNumber) {
      this.StudentNumber = StudentNumber;
  }
  
  
  
  public double getCourseAverage() {
	  
	return courseAverage;  
  }

  
  
  public void set_CourseAverage( double courseAverage ) {
	  
	  if (courseAverage <=0 || courseAverage >=100 ) {
		  this.courseAverage = courseAverage; 
	  }else {
		  System.err.println("Invalid course average input.");
	  }
  }

  public String getLetterGrade() {
	  if (courseAverage >= 90) {
	        return "A";
	    } else if (courseAverage >= 80) {
	        return "B";
	    } else if (courseAverage >= 70) {
	        return "C";
	    } else if (courseAverage >= 60) {
	        return "D";
	    } else {
	        return "F";
	    }
  }
  
  
  
  public void show() {
	  
	  System.out.println("Name :" + firstName);
	  System.out.println("Last Name :"+ lastName);
	  System.out.println("Student Number :"+ StudentNumber);
	  System.out.println("Course Average :"+ courseAverage);

  
  }
  

  
  
   

}
