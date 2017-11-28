package arrayClassesPackage;

import javax.swing.JOptionPane;

public class StudentArray {
	
	Boolean input = false;	
	Boolean i = false;	

	Student[] Pet = new Student[11];
	
	


	public void buildArray() {
		
		
		String[] opt = new String[] {"Yes", "No"};
		String msg = "";
		
		msg = "Do you want to add to the records?";
		
		int confirms = JOptionPane.showOptionDialog(null, msg, "Message",
			      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
			       null, opt, opt[0]);
		 
				if (confirms == JOptionPane.YES_OPTION) {
				
					input = true;
				}
				
				else { 
					JOptionPane.showMessageDialog(null, "Good Bye!");
				

				}

				while (input) {
					int r = 0;
					int t = 8;
					t = t + 1;
			
		Pet[t] = new Student();
		Pet[t].setBreed(JOptionPane.showInputDialog(null, "What is the animal/breed?"));//1
		Pet[t].setGender(JOptionPane.showInputDialog(null, "Is it a Male or a Female?"));//2
		r = Integer.parseInt(JOptionPane.showInputDialog(null, "How old is it?"));//3
		Pet[t].setAge(r);//3
		Pet[t].setSymptoms(JOptionPane.showInputDialog(null, "What are its symotoms?"));//4
		
		input = false;
		
		
				}
		
		
		Pet[0] = new Student();
		Pet[0].setBreed("Horse");//1
		Pet[0].setGender("Female");//2
		Pet[0].setAge(11);//3
		Pet[0].setSymptoms("Flu");//4
		
		Pet[1] = new Student();
		Pet[1] = new Student();
		Pet[1].setBreed("Cat");//1
		Pet[1].setGender("Male");//2
		Pet[1].setAge(3);//3
		Pet[1].setSymptoms("Infeceted Paw");//4
		
		Pet[2] = new Student();
		Pet[2].setBreed("Dog");//1
		Pet[2].setGender("Female");//2
		Pet[2].setAge(6);//3
		Pet[2].setSymptoms("Heart");//4
		
		Pet[3] = new Student();
		Pet[3].setBreed("Parrot");//1
		Pet[3].setGender("Female");//2
		Pet[3].setAge(3);//3
		Pet[3].setSymptoms("Voice Box");//4
		
		Pet[4] = new Student();
		Pet[4].setBreed("Whale");//1
		Pet[4].setGender("Male");//2
		Pet[4].setAge(15);//3
		Pet[4].setSymptoms("Blow Hole");//4
		
		Pet[5] = new Student();
		Pet[5].setBreed("Fly");//1
		Pet[5].setGender("UnKnown");//2
		Pet[5].setAge(1);//3
		Pet[5].setSymptoms("Wing");//4
		
		Pet[6] = new Student();
		Pet[6].setBreed("Butterfly");//1
		Pet[6].setGender("Female");//2
		Pet[6].setAge(4);//3
		Pet[6].setSymptoms("Coma");//4

		Pet[7] = new Student();
		Pet[7].setBreed("Bull");//1
		Pet[7].setGender("Male");//2
		Pet[7].setAge(7);//3
		Pet[7].setSymptoms("Horn");//4

		Pet[8] = new Student();
		Pet[8].setBreed("Lizard");//1
		Pet[8].setGender("Male");//2
		Pet[8].setAge(2);//3
		Pet[8].setSymptoms("Tounge");//4
		
	
				
	
	}

	public void showArray() {
		
		
	
		
		
		String msg = "";
		String[] opt = new String[] {"Yes", "No"};
		
		for (int s = 0; s < Pet.length; s++) {
			System.out.println("Breed: " + Pet[s].getBreed());
			System.out.println("Gender: " + Pet[s].getGender());
			System.out.println("Age in years: " + Pet[s].getAge());
			System.out.println("Symptoms: " + Pet[s].getSymptoms());
			System.out.println("");
			
		}
		
		msg = "Do you want to input another animal into the system?";
		int confirm = JOptionPane.showOptionDialog(null, msg, "Message",
			      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
			       null, opt, opt[0]);
		 
				if (confirm == JOptionPane.YES_OPTION) {
				
					While();
				}
				
				else { 
					i = false;
				}
		
				
	
		
	}

	public void While() {
		i = true;
		
		
		

	while (i) {
		
		

		int r = 0;
		int t = 9;
		t = t + 1;
		
Pet[t] = new Student();
Pet[t].setBreed(JOptionPane.showInputDialog(null, "What is the animal/breed?"));//1
Pet[t].setGender(JOptionPane.showInputDialog(null, "Is it a Male or a Female?"));//2
r = Integer.parseInt(JOptionPane.showInputDialog(null, "How old is it?"));//3
Pet[t].setAge(r);//3
Pet[t].setSymptoms(JOptionPane.showInputDialog(null, "What are its symotoms?"));//4

i = false;
	}
	showArray();
	
	
	}
	
}



