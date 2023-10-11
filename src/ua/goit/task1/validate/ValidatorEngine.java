package ua.goit.task1.validate;

import ua.goit.task1.read.ContentReader;
import ua.goit.task1.read.Readable;

import java.io.File;

public class ValidatorEngine {
    public void validateAndPrintResults(File file){
        Readable reader = new ContentReader();
        Validatable validator = new ContentValidator();
        String content = reader.contentRead(file);
        String[] contents = content.split("\n");
        for (String validatedPhoneNumber : contents) {
            if(validator.isValidate(validatedPhoneNumber)){
                System.out.println("validatedPhoneNumber = " + validatedPhoneNumber);
            }
        }
    }
}
