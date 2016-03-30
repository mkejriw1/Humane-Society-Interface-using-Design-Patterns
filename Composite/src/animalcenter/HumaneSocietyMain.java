package animalcenter;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.*;

public class HumaneSocietyMain {	
	
	ArrayList<Animal> animals = new ArrayList<Animal>();
	Long max = 1001L;	

	public static void main(String[] args) {		
		
		HumaneSocietyMain human = new HumaneSocietyMain();		
		 
		JFrame frame = new JFrame("Test");
		frame.setVisible(true);
		frame.setSize(300, 250);
		frame.setTitle("Human Society Center");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Hello");
		JPanel panel = new JPanel();
		frame.add(panel);
		//panel.add(label);
		
		JButton addbutton = new JButton("Add an animal");
		panel.add(addbutton);
		addbutton.addActionListener(new ActionListener() {
						
			@Override
			public void actionPerformed(ActionEvent e) {				
				human.addAnimal();
			}
		});
		
		JButton viewButton = new JButton("Draw animal");
		panel.add(viewButton);
		viewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				human.viewAnimal();
			}
		});
		
		JButton statbutton = new JButton("Statistics");
		panel.add(statbutton);
		statbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				human.viewStats();
			}
		});
		
		JButton close = new JButton("Close");
		panel.add(close);
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		
	}		
	
	public void addAnimal() {
		JFrame add = new JFrame("Add animal");
		add.setVisible(true);
		add.setSize(400, 300);
		add.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		add.add(panel);
		//name of animal
		JLabel nameLabel = new JLabel("Animal Name");
		JTextArea name = new JTextArea("", 2, 20);
		name.setBorder(BorderFactory.createLoweredBevelBorder());
		panel.add(nameLabel);
		panel.add(name);
		
		//age of animal
		JLabel ageLabel = new JLabel("Animal Age");
		JTextArea age = new JTextArea("", 2, 20);
		age.setBorder(BorderFactory.createLoweredBevelBorder());
		panel.add(ageLabel);
		panel.add(age);
		
		//mammal or bird
		JLabel categortLabel = new JLabel("Select the category of animal");
		String[] category = {"Mammal", "Bird"};
		JComboBox<String> categoryChoice = new JComboBox<String>(category);
		categoryChoice.setVisible(true);
		panel.add(categortLabel);
		panel.add(categoryChoice);
		
		//type of animal
		String[] types = {"Dog", "Cat"};	
		JComboBox<String> typeChoice = new JComboBox<String>(types);
		categoryChoice.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent event) {
				if (event.getStateChange() == ItemEvent.SELECTED) {
			          Object item = event.getItem();
			          //System.out.println("Inside listener");
			          if(item.toString().equalsIgnoreCase("Mammal")){			        	   
							types[0] = "Dog";
							types[1] = "Cat";
						} else if(item.toString().equalsIgnoreCase("Bird")) {
							types[0] = "Chicken";
							types[1] = "Sparrow";
						}
			          typeChoice.removeAllItems();
			          typeChoice.addItem(types[0]);
			          typeChoice.addItem(types[1]);
			       }
				
			}});		
		
		JLabel typeLabel = new JLabel("Animal type");				
		typeChoice.setVisible(true);
		panel.add(typeLabel);
		panel.add(typeChoice);
		
		//breed of animal
		String[] breed = {"Dalmatian", "Poodle"};	
		JComboBox<String> breedChoice = new JComboBox<String>(breed);
		typeChoice.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent event) {
				if (event.getStateChange() == ItemEvent.SELECTED) {
			          Object item = event.getItem();
			          String choice = item.toString();
			          //System.out.println("Inside listener");
			          if(choice.equalsIgnoreCase("Dog")){			        	   
							breed[0] = "Dalmatian";
							breed[1] = "Poodle";
							breedChoice.removeAllItems();
							breedChoice.addItem(breed[0]);
							breedChoice.addItem(breed[1]);
					  } else {						    
							breed[0] = choice;
							breed[1] = null;
							breedChoice.removeAllItems();
							breedChoice.addItem(breed[0]);
					  }			          
			       }
				
			}});
		
		JLabel breedLabel = new JLabel("Select the breed of animal");	
		
		categoryChoice.setVisible(true);
		panel.add(breedLabel);
		panel.add(breedChoice);
		
		//ready for adoption
		JLabel adoptLabel = new JLabel("Ready for adoption:");
		String[] adoption = {"Yes", "No"};
		JComboBox<String> adoptChoice = new JComboBox<String>(adoption);
		adoptChoice.setVisible(true);
		panel.add(adoptLabel);
		panel.add(adoptChoice);		
		
		//medical condition		
				JLabel medicalLabel = new JLabel("Medical Condition");
				JTextArea medical = new JTextArea("", 2, 20);
				name.setBorder(BorderFactory.createLoweredBevelBorder());
				panel.add(medicalLabel);
				panel.add(medical);
				
		//extra notes				
				JLabel noteLabel = new JLabel("Notes");
				JTextArea notes = new JTextArea("", 2, 20);
				name.setBorder(BorderFactory.createLoweredBevelBorder());
				panel.add(noteLabel);
				panel.add(notes);
				
		//Add button
				JButton addbutton = new JButton("Add");
				panel.add(addbutton);
				addbutton.addActionListener(new ActionListener() {
								
					@Override
					public void actionPerformed(ActionEvent e) {				
						//System.out.println("Successfully input received");
						String finalName = name.getText();
						int finalAge = Integer.parseInt(age.getText());
						String finalMedical = medical.getText();
						String finalNotes = notes.getText();
						boolean adopt = false;
						if(adoptChoice.getSelectedItem().toString().equalsIgnoreCase("Yes")) {
							adopt = true;
						} else {
							adopt = false;
						}
						String finalCategory = categoryChoice.getSelectedItem().toString();
						String finalType = typeChoice.getSelectedItem().toString();
						String finalBreed = breedChoice.getSelectedItem().toString();
						if(finalType.equalsIgnoreCase("Dog")) {
							animals.add(new Dog(finalName, max, finalAge, finalType, finalBreed, adopt, finalMedical, finalNotes));
						} else if(finalType.equalsIgnoreCase("Cat")) {
							animals.add(new Cat(finalName, max, finalAge, finalType, finalBreed, adopt, finalMedical, finalNotes));
						} else if(finalType.equalsIgnoreCase("Chicken")) {
							animals.add(new Chicken(finalName, max, finalAge, finalType, finalBreed, adopt, finalMedical, finalNotes));
						} else if(finalType.equalsIgnoreCase("Sparrow")) {
							animals.add(new Sparrow(finalName, max, finalAge, finalType, finalBreed, adopt, finalMedical, finalNotes));
						}
						
						add.dispose();						
						
					}
				});	
		
	}
	
	public void viewAnimal() {JFrame view = new JFrame("View An Animal");
	view.setVisible(true);
	view.setSize(400, 300);
	view.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);		
	JPanel panel = new JPanel();
	view.add(panel);			       
	
	
	JLabel byNameLabel = new JLabel("Search by name:");
	JTextArea byName = new JTextArea("", 2, 20);
	byName.setBorder(BorderFactory.createLoweredBevelBorder());
	panel.add(byNameLabel);
	panel.add(byName);
	
	JButton searchButton = new JButton("Search");
	panel.add(searchButton);
	searchButton.addActionListener(new ActionListener() {	
					
		@Override
		public void actionPerformed(ActionEvent e) {	
			String searchName = ""; Long searchID = 0L; boolean found = false;
			if(animals.isEmpty()) {System.out.println("List is empty please add animal first");}
			//System.out.println("Successfully input received");
			if(!byName.getText().isEmpty()) {
				searchName = byName.getText();
			}
			
			//System.out.println("Name recd: "+searchName+"   id recd:"+searchID);
			if((!searchName.isEmpty()) && searchID.compareTo(new Long(0L) )!= 0) {
				for(Animal ani: animals) {
					System.out.println("ID: "+ani.getId()+"  "+(ani.getId() == searchID));
					if((ani.getName().equalsIgnoreCase(searchName)) && (ani.getId().compareTo(searchID) == 0)) {
						found = true; System.out.println("Inside both found? "+found);
						System.out.println(ani);
					} else {
						continue;
					}
				}
			} else if(!searchName.isEmpty()) {
				for(Animal ani: animals) {
					if(ani.getName().equalsIgnoreCase(searchName)) {
						found = true; System.out.println("Inside name found? "+found);
						System.out.println(ani);
					} else {
						continue;
					}
				}		
			} else if(searchID.compareTo(new Long(0L) )!= 0) {
				for(Animal ani: animals) {
					if(ani.getId().compareTo(searchID) == 0) {
						found = true; System.out.println("Inside ID found? "+found);
						System.out.println(ani);
					} else {
						continue;
					}
				}
			}
			if (!found) {System.out.println("No match found");}
			view.dispose();
		}
	});	}
	
	public void viewStats() {
		int size = 0;
		HashMap<String, HashMap<String, Integer>> typeCount = new HashMap<String, HashMap<String, Integer>>();
		for(Animal ani: animals) {							
			if(typeCount.containsKey(ani.getType())) {
				HashMap<String, Integer> count = typeCount.get(ani.getType());
				int counter = 1;
				if(count.containsKey(ani.getBreed())) {					
					counter = count.get(ani.getBreed());
					counter++;
					//System.out.println("inside if: "+ani.getType()+" "+ani.getBreed()+" "+counter);
   			    } else {
   			    	size++;
   			    }
				count.put(ani.getBreed(), counter);
				typeCount.put(ani.getType(), count);
		    } else {
		    	HashMap<String, Integer> count = new HashMap<String, Integer>();
		    	count.put(ani.getBreed(), 1);
				typeCount.put(ani.getType(), count);
				size++;
		    }			
		
	 }
		//System.out.println(typeCount);
		//System.out.println("***********************************************************************");
		
		JFrame stat = new JFrame("View Statistics");
		stat.setVisible(true);
		stat.setSize(400, 300);
		stat.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		stat.add(panel);		
		Object[][] data = new Object[size+1][3];
		data[0][0] = "Type"; data[0][1] = "Breed"; data[0][2] = "Count";
		Set<String> typeSet = typeCount.keySet();
		int i = 1, j = 0;
		for(String types: typeSet) {			
			HashMap<String, Integer> count = typeCount.get(types);
			Set<String> breedSet = count.keySet();
			for(String breed : breedSet) {
				j=0;
				int total = count.get(breed);
				System.out.println("Type: "+types+" ||||||||||Breed: "+breed+" ||||||||||count"+total);
				data[i][j++] = types;
				data[i][j++] = breed;
				data[i][j++] = total;
				i++;
			}
		}
		String[] columns = new String[] {"Type", "Breed", "Count"};
		JTable table = new JTable(data, columns);
		panel.add(table);
		
		JButton close = new JButton("Close");
		panel.add(close);
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stat.dispose();
			}
		});
	}

}
