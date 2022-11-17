package studio8;

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

	public static void main(String[] args) {
 
    	
    }

}