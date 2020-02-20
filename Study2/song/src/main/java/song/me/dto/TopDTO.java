package song.me.dto;

import java.lang.reflect.InvocationTargetException;

public class TopDTO {	
	public TopDTO getDTO() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		return getClass().getConstructor(null).newInstance(null);
	}
}
