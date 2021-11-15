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
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import metamodel.proxies.Entity;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;

public class GetAllEntityNames extends CustomJavaAction<java.util.List<IMendixObject>>
{
	public GetAllEntityNames(IContext context)
	{
		super(context);
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		ArrayList<IMendixObject> result = new ArrayList<IMendixObject>(); 
		for(IMetaObject metaObject : Core.getMetaObjects())
		{
			IMendixObject entity = Core.instantiate(getContext(), Entity.getType());
			entity.setValue(getContext(), Entity.MemberNames.CompleteName.toString(), metaObject.getName());
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
		return "GetAllEntityNames";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
