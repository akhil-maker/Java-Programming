class DataType{ 
    public static void main(String args[]) 
    { 
        char c = 'G'; 
        int i = 89;  
        byte b = 4; 
        short sh = 56; 
  		double d = 4.355453532; 
  		float f = 4.7333434f;
  		String s="Hello";
  		boolean bl = true;
  		int a[]={1,2,3};
  		System.out.println("Some of the data types in Java are:");
        System.out.println("char: " + c); // For characters
        System.out.println("integer: " + i); // For integers
        System.out.println("byte: " + b); 
        System.out.println("short: " + sh); 
        System.out.println("float: " + f); 
        System.out.println("double: " + d); 
        System.out.println("String: " + s); // For Strings
        System.out.println("Boolean: " + bl); // For Boolean
        System.out.print("Array: ");
        for(i=0;i<a.length;i++){
        	System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
