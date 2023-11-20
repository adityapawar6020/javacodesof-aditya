package SERIALDESERI;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;

	class Demo implements java.io.Serializable{
		

			public int id;
			public String name;

			
			public Demo(int id, String name)
			{
				this.id = id;
				this.name = name;
			}

		}

		class SD
		{
			public static void main(String[] args)
			{ 
				Demo object = new Demo(1, "Rajnish");
			
				
			 
				try
				{ 
					
					FileOutputStream file = new FileOutputStream("f.txt");
					ObjectOutputStream out = new ObjectOutputStream(file);
					
					
					out.writeObject(object);
					
					out.close();
					file.close();
					
					System.out.println("Object has been serialized");

				}
				
				catch(IOException ex)
				{
					System.out.println("IOException is caught");
				}


				Demo object1 = null;

				
				try
				{ 
					
					FileInputStream file = new FileInputStream("f.txt");
					ObjectInputStream in = new ObjectInputStream(file);
					
					
					object1 = (Demo)in.readObject();
					
					in.close();
					file.close();
					
					System.out.println("Object has been deserialized ");
					System.out.println("a = " + object1.id);
					System.out.println("b = " + object1.name);
				}
				
				catch(IOException ex)
				{
					System.out.println("IOException is caught");
				}
				
				catch(ClassNotFoundException ex)
				{
					System.out.println("ClassNotFoundException is caught");
				}

			}
		}



	
	
	
	
	
	
	
	


