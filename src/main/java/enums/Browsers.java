package enums;

import lombok.Getter;

@Getter
public enum Browsers {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge");

    public String var;//final

    Browsers(String var){
        this.var=var;
    }

}
