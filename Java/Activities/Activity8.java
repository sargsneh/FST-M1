package Activities;

class CustomException extends Exception {
	String message = "An error has occured";
	
	CustomException(String message){
		this.message = message;
	}
	
	@Override
	public String getMessage() {
	    return message;
	}
}

public class Activity8 {
	String str = null;
	public void exceptionTest(String str) throws CustomException {
		if (str == null) {
			throw new CustomException("String is null");	
		} else {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		Activity8 testObj = new Activity8();
		try{
			testObj.exceptionTest("Test String");
		} catch (CustomException e) {
			e.printStackTrace();
		}

	}

}
