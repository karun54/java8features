package java8features;

import java.util.Set;

class Developer {
	 
	  private String name;
	  private Set<String> skills;
	  
	  public Developer(String name, Set<String> skills){
	    this.name = name;
	    this.skills = skills;
	  }
	  
	  public String getName() {
	    return this.name;
	  }
	  
	  public Set<String> getSkills(){
	    return this.skills;
	  }
	  
	  public String toString() {
	    return "{name = " + this.name + ", skills = " + this.skills + "}";
	  }
	}