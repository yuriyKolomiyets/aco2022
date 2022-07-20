package aco.w4.model;

public class AutoKey {

    private String startKey;

    public AutoKey() {
        this.startKey = "valid key for my tesla";
    }

    public String getStartKey() {
        return startKey;
    }

    //not secured just for test
    public void setStartKey(String startKey) {
        this.startKey = startKey;
    }
}
