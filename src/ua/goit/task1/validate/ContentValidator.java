package ua.goit.task1.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContentValidator implements Validatable{
    @Override
    public boolean isValidate(String content) {

        Pattern validationModel1 = Pattern.compile("^(\\((\\d{3})\\) ?(\\d{3})-(\\d{4}))$");
        Pattern validationModel2 = Pattern.compile("^((\\d{3})-(\\d{3})-(\\d{4}))$");

        Matcher validationModelMatcher1 = validationModel1.matcher(content);
        Matcher validationModelMatcher2 = validationModel2.matcher(content);
        if (validationModelMatcher1.matches()||validationModelMatcher2.matches()){
            return true;
        }
        return false;
    }
}
