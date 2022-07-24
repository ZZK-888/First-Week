package SecondWeek;

class myException extends Exception {

    public myException() {
    }

    @Override
    public String toString() {
        return "被除数为0";
    }

    @Override
    public String getMessage() {
        return "被除数为0";
    }
}