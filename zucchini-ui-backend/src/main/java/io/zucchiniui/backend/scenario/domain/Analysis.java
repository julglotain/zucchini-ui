package io.zucchiniui.backend.scenario.domain;

public class Analysis {

    private String action;

    private String result;

    public Analysis() {
        action = "";
        result = "";
    }

    public Analysis(String action, String result) {
        this.action = action;
        this.result = result;
    }

    public String getAction() {
        return action;
    }

    public String getResult() {
        return result;
    }

    public void setAction(String action) {
        if (this.action.equals(action)) {
            return;
        }
        this.action = action;
    }

    public void setResult(String result) {
        if (this.result.equals(result)) {
            return;
        }
        this.result = result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Analysis other = (Analysis) obj;
        return  (result.equals(other.result) && action.equals(other.action));
    }
}
