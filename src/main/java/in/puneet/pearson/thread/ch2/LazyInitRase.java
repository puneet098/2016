/**
 * 
 */
package in.puneet.pearson.thread.ch2;

import net.jcip.annotations.NotThreadSafe;

/**
 * @author user
 *
 */
@NotThreadSafe
public class LazyInitRase {
	
	private  Person person = null;
	
	public Person getPerson() {
		if(person == null) 
			person = new Person();
		
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	

}
