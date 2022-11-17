package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
private int hour;
private int min;
private int sec;

public Time (int hour, int min, int sec) {
	this.hour = hour;
	this.min = min;
	this.sec = sec;
}

	@Override
public int hashCode() {
	return Objects.hash(hour, min, sec);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Time other = (Time) obj;
	return hour == other.hour && min == other.min && sec == other.sec;
}

public String toString() {
	return hour + " " + min +" " + sec;
}
public static void main(String[] args) {
	LinkedList<Date> list = new LinkedList<Date>();
	Time t1 = new Time(1, 2, 1);
	Time t2 = new Time(1, 2, 1);
	list.add(t1);
	list.add(t2);
	list.add(t1);
	System.out.println(list);
	HashSet<Date> set = new HashSet<Date>();
	set.add(t1);
	set.add(t2);
	set.add(t1);
	System.out.println(set);
}

}