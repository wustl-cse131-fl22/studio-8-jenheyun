package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

import org.junit.platform.commons.util.ToStringBuilder;

public class Date {
private int month;
private int day;
private int year;
private boolean holiday;

public Date(int month, int day,int year, boolean holiday) {
	this.month=month;
	this.day=day;
	this.year=year;
	this.holiday=holiday;
	
}
@Override
public int hashCode() {
	return Objects.hash(day, month, year);
}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
    
    public String toString() {
    	return day + " " + month +" " + year;
    }
	public static void main(String[] args) {
		LinkedList<Date> list = new LinkedList<Date>();
		Date d1 = new Date(1, 2, 2022, false);
		Date d2 = new Date(1, 2, 2022, false);
		list.add(d1);
		list.add(d2);
		list.add(d1);
		System.out.println(list);
		HashSet<Date> set = new HashSet<Date>();
		set.add(d1);
		set.add(d2);
		set.add(d1);
		System.out.println(set);
    }
	
	
    
}
