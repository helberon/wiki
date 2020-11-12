package enums;

import lombok.Getter;

@Getter
public enum Browsers {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge");

    public String var;

    @Override
    public String toString() {
        return var;
    }

    Browsers(String var){
        this.var=var;
    }

}
