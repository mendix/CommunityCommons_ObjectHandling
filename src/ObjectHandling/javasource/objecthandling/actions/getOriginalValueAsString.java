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
import objecthandling.ORM;
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * Returns the original value of an object member, that is, the last committed value.
 * 
 * This is useful if you want to compare the actual value with the last stored value. 
 * - item : the object of which you want to inspect a member
 * - member: the member to retrieve the previous value from. Note that for references, the module name needs to be included.
 * 
 * The function is applicable for non-String members as well, but always returns a String representation of the committed value.
 */
public class getOriginalValueAsString extends UserAction<java.lang.String>
{
	private final IMendixObject item;
	private final java.lang.String member;

	public getOriginalValueAsString(
		IContext context,
		IMendixObject _item,
		java.lang.String _member
	)
	{
		super(context);
		this.item = _item;
		this.member = _member;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return ORM.getOriginalValueAsString(this.getContext(), item, member);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "getOriginalValueAsString";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
