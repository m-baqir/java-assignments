package Assignment4;

public class UndergradStudent extends AlgomaStudent implements Decrementable {
    private int yearsLeft;

    /** default constructor */
    public UndergradStudent() {
        yearsLeft = 4;
    }

    /** constructor with arguments */
    public UndergradStudent(int yearsLeft) {
        this.yearsLeft = yearsLeft;
    }

    public int getYearsLeft() {
        return yearsLeft;
    }

    public void setYearsLeft(int yearsLeft) {
        this.yearsLeft = yearsLeft;
    }

    @Override
    public int coursesLeft() {
        return yearsLeft * 10;
    }

    @Override
	public int decrement() {
                yearsLeft--;
		return yearsLeft;
	}
}