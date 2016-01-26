package common;

public class AncientMoneyEvent extends Events {
    Ancient ancient;

    public AncientMoneyEvent(Ancient ancient) {
        this.ancient = ancient;
        this.remainingTime = 1000;
        this.passedTime = 0;
    }

    @Override
    public void eventAction() {
        if (remainingTime > 0){
            remainingTime -= 50;
            passedTime += 50;
        }else {
            ancient.addGoldMineMoney();
            ancient.addTimeMoney();
            this.remainingTime = 1000;
            this.passedTime = 0;
        }
    }

    public Ancient getAncient() {
        return ancient;
    }

    public void setAncient(Ancient ancient) {
        this.ancient = ancient;
    }
}
