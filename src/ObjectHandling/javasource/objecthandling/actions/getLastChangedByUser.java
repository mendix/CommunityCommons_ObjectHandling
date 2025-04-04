// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package objecthandling.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import objecthandling.ORM;

/**
 * Returns the user that last changed this object as System.User 
 * 
 * (or empty if not applicable).
 */
public class getLastChangedByUser extends CustomJavaAction<IMendixObject>
{
	private IMendixObject thing;

	public getLastChangedByUser(IContext context, IMendixObject thing)
	{
		super(context);
		this.thing = thing;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		return ORM.getLastChangedByUser(getContext(), thing);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "getLastChangedByUser";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
