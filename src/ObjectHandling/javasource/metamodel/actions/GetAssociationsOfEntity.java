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
import metamodel.proxies.Association;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaAssociation;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;

public class GetAssociationsOfEntity extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String entityName;

	public GetAssociationsOfEntity(IContext context, java.lang.String entityName)
	{
		super(context);
		this.entityName = entityName;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		IMetaObject metaObject = Core.getMetaObject(entityName);
		if (metaObject==null) return null;
		ArrayList<IMendixObject> result = new ArrayList<IMendixObject>();
		for(IMetaAssociation metaAssoc : metaObject.getMetaAssociationsParent())
		{
			IMendixObject assoc = Core.instantiate(getContext(), Association.getType());
			assoc.setValue(getContext(), Association.MemberNames.CompleteName.toString(), metaAssoc.getName());
			assoc.setValue(getContext(), Association.MemberNames.TargetEntityName.toString(), metaAssoc.getChild().getName());
			result.add(assoc);
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
		return "GetAssociationsOfEntity";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
