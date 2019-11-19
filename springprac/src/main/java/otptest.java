
public class otptest {

	public static String generateOTP()
	{
		int randompin=(int) (Math.random()*9000)+1000;
		String otp=String.valueOf(randompin);
		return otp;
		
	}
	public static void main(String[] args){
		System.out.println("OTP generated is:" +generateOTP());
	}
	
}
