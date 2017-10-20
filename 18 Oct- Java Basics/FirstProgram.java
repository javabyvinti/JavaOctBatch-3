// public static void main(){}

class FirstProgram{

	//no error at compilation time
	static public void main(String[] a)
	//java 1.5 version --> flexiblity --> [] or ...
	{
		//int value1 = 60;
		//int value2 = 60;
		
		//Integer value1 = new Integer(90);

		//Integer value2 = new Integer(90);
			
		String value1 = new String("Java");
		String value2 = new String("java");		

		//comparision operator --> address
		//System.out.println(value1 == value2);	
	
	//System.out.println(value1.equals(value2));	
	
System.out.println(value1.equalsIgnoreCase(value2));
	}

}


