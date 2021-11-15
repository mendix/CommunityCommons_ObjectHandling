// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package metamodel.actions;

import java.util.ArrayList;
import java.util.TreeSet;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import metamodel.proxies.Microflow;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetMicroflowNames extends CustomJavaAction<java.util.List<IMendixObject>>
{
	public GetMicroflowNames(IContext context)
	{
		super(context);
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		ArrayList<IMendixObject> result = new ArrayList<IMendixObject>();
		TreeSet<String> mfSet = new TreeSet<String>(Core.getMicroflowNames());
		for(String mfName : mfSet)
		{
			IMendixObject entity = Core.instantiate(getContext(), Microflow.getType());
			entity.setValue(getContext(), Microflow.MemberNames.CompleteName.toString(), mfName);
			result.add(entity);
		}
		return result;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetMicroflowNames";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}