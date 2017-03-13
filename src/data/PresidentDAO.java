package data;

import java.util.List;

public interface PresidentDAO {

	    List<PresidentDAO> getPresidentsList();
	    int getPresidentNumber();
	    String getFirstName();
	    String getMiddleName();
	    String getLastName();
	    int getDateBegin();
	    int getDateEnd();
	    String getParty();
	    String getPicture();
	    String getFunFact();

	}


