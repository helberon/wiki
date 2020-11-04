package enums;

import java.util.Arrays;

public class EnumHelper {
    public static <T extends Enum<T>> T valueOf(Class<T> enumType, String value){
        return Arrays.stream(enumType.getEnumConstants())
                .filter(item -> item.toString().equals(value))
                .findFirst()
                .orElseThrow(() -> new EnumConstantNotPresentException(enumType,value));
    }
}
