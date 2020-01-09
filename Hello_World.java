/*
 * 
 *
 */


public class Hello_World
{
		//Declaration
		String[] randomNames = {"Abongile","Tebogo","Moeketsi", "Tebogo", "Jabulani",
		"Kind", "Sisi", "Samuel", "Abongile", "Kindness", "Sisi", "Moeketsi", "Faith", "Jabu"};


		//Main method
		public static void main(String[] args)
		{
			System.out.println("This program prints duplicates in a string array");
			this.readOutDuplicates(randomNames);
		}
		
		//This method takes in a string array and prints out the duplicates
		public void readOutDuplicates(String[] names)
		{
			for(int x = 0; names.length; x++)
			{
				for(int y = x+1; names.length; y++)
				{
					if(names[x].equalsIgnoreCase(names[y]))
					{
						System.out.print(names[x]+" ");
					}
				}
			}
		}
}