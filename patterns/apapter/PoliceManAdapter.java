package aco.patterns.apapter;

public class PoliceManAdapter extends PoliceMan{

    private Militioner militioner;

    public PoliceManAdapter(Militioner militioner) {
        this.militioner = militioner;
    }

    @Override
    public void doGoodJob() {
        militioner.sevre();
    }
}
