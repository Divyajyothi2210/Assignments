import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Zipvalidator implements ConstraintValidator<IsZipValid, String>{
	@Override
	public void initialize(IsZipValid arg0) {
		
	}

	@Override
	public boolean isValid(String zip, ConstraintValidatorContext arg1) {
		if(zip.matches("458416|894511|879248|435416|454511|879988"))
			return true;
		return false;
	}
}
