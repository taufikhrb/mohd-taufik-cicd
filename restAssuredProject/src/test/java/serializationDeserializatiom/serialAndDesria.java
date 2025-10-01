package serializationDeserializatiom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable{
	int a =10;
	int b=30;
}


public class serialAndDesria {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test t1=new Test();
		
		FileOutputStream fos=new FileOutputStream("test.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(t1);
		
		//Deserialization
		FileInputStream fis=new FileInputStream("test.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Test t2=(Test) ois.readObject();
		System.out.println(t2.a+" "+t2.b);
		
		
		
		
	}

}
