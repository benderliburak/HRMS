package spring.homework.core.verifications;

import org.springframework.stereotype.Service;

@Service("fakeEmail")
public class EmailValidator implements EmailService{
	EmailSender emailSender=new EmailSender();
	@Override
	public boolean emailSend(String email) {
	
		return emailSender.emailVerification(email);
	
	}

}
