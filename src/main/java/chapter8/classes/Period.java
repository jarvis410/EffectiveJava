package chapter8.classes;

import java.util.Date;

public final class Period {
    private final Date start;
    private final Date end;

    /**
     * @param start the beginning of the period
     * @param end   the end of the period; must not precede start * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException if start or end is null
     */
    public Period(Date start, Date end) {
        // below snippet allows to change Date as date is mutable instance
        /*if (start.compareTo(end) > 0)
            throw new IllegalArgumentException(start + " after " + end);

        this.start = start;
        this.end = end;*/

        // below snippet does not change Date value in Period as we are creating new instance
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(this.start + " after " + this.end);
    }

    public Date start() {
//        return start; // doesn't works as Date value can be changed from outside
        return new Date(start.getTime()); // provide new instance so that original cannot be changed
    }

    public Date end() {
//        return end; // doesn't works as Date value can be changed from outside
        return new Date(end.getTime()); // provide new instance so that original cannot be changed
    }

    @Override
    public String toString() {
        return "Period:: start: " + start() + "\t" + "end: " + end();
    }
}
