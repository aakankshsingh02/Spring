package Springfirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
        coach theCoach= context.getBean("myCoach", coach.class);
      
        System.out.println(theCoach.getDailyWorkout());
       
        
        System.out.println(theCoach.getHappy());
        context.close(); 
	}

}
