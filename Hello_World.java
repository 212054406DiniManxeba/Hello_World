/*
 * 
 *
 */


public class Hello_World
{		
		public static void main(String[] args)
		{
			System.out.println("Hello World");
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
						System.out.println(names[x]+" ");
					}
				}
			}
		}
}