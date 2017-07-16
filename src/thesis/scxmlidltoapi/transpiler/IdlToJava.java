package thesis.scxmlidltoapi.transpiler;

import thesis.scxmlidltoapi.antlr.WebIDLBaseListener;
import thesis.scxmlidltoapi.antlr.WebIDLParser;
import thesis.scxmlidltoapi.utils.Util;

public class IdlToJava extends WebIDLBaseListener {
	
	String Interfacename;
	
	@Override
	public void enterInterface_(WebIDLParser.Interface_Context ctx) {
		Interfacename = ctx.getChild(1).toString();
		Util u = new Util();
		u.createFile("java/"+Interfacename + ".java");
		// System.out.print(ctx.getChild(0)+" "+ctx.getChild(1)+" ");
		System.out.print("interface " + ctx.getChild(1) + " ");

	}

	@Override
	public void exitInterface_(WebIDLParser.Interface_Context ctx) {

		System.out.println("\n};");
	}

	@Override
	public void enterInheritance(WebIDLParser.InheritanceContext ctx) {

		if (ctx.getChildCount() != 0) {
			System.out.printf("implements " + ctx.getChild(1) + " {\n");
			// System.out.printf("\\u%04x", 12);
		} else {
			System.out.print("{\n");
		}

	}

	@Override
	public void exitInheritance(WebIDLParser.InheritanceContext ctx) {

	}

	@Override
	public void enterAttributeRest(WebIDLParser.AttributeRestContext ctx) {
		System.out.printf("\n");

	}

	@Override
	public void exitAttributeRest(WebIDLParser.AttributeRestContext ctx) {
		// System.out.printf(";");

	}

	@Override
	public void enterAttributeName(WebIDLParser.AttributeNameContext ctx) {
		System.out.printf(" " + ctx.getText() + ";");

	}

	@Override
	public void exitAttributeName(WebIDLParser.AttributeNameContext ctx) {

	}

	@Override
	public void enterFloatType(WebIDLParser.FloatTypeContext ctx) {
		System.out.printf("" + ctx.getText());
	}

	@Override
	public void exitFloatType(WebIDLParser.FloatTypeContext ctx) {
		System.out.printf("");
	}

	@Override
	public void enterReturnType(WebIDLParser.ReturnTypeContext ctx) {
		if(ctx.getText().equalsIgnoreCase("void"))
		System.out.printf(ctx.getText() + " ");
		else 
			System.out.printf("");
			
	}

	@Override
	public void exitReturnType(WebIDLParser.ReturnTypeContext ctx) {
		//if(ctx.getText().equalsIgnoreCase("DOMString"))
		//System.out.printf("String" + " ");
		//else
		}

	@Override
	public void enterOptionalIdentifier(WebIDLParser.OptionalIdentifierContext ctx) {
		System.out.printf(ctx.getText() + " ");

	}

	@Override
	public void exitOptionalIdentifier(WebIDLParser.OptionalIdentifierContext ctx) {
	}

	@Override
	public void enterOperationRest(WebIDLParser.OperationRestContext ctx) {
	}

	@Override
	public void exitOperationRest(WebIDLParser.OperationRestContext ctx) {
	}

	@Override
	public void enterArgumentName(WebIDLParser.ArgumentNameContext ctx) {
		System.out.printf(ctx.getText());
	}

	@Override
	public void exitArgumentName(WebIDLParser.ArgumentNameContext ctx) {
	}

	@Override
	public void enterNonAnyType(WebIDLParser.NonAnyTypeContext ctx) {
			
	}

	@Override
	public void exitNonAnyType(WebIDLParser.NonAnyTypeContext ctx) {
	}

	@Override
	public void enterArgumentList(WebIDLParser.ArgumentListContext ctx) {
		System.out.printf("(");
	}

	@Override
	public void exitArgumentList(WebIDLParser.ArgumentListContext ctx) {
		System.out.printf(");\n");
	}

	@Override
	public void enterArguments(WebIDLParser.ArgumentsContext ctx) {
	}

	@Override
	public void exitArguments(WebIDLParser.ArgumentsContext ctx) {
	}

	@Override public void enterPartialInterface(WebIDLParser.PartialInterfaceContext ctx) { 

	}
	@Override public void exitPartialInterface(WebIDLParser.PartialInterfaceContext ctx) { 

	}
	
	@Override public void enterTypedef(WebIDLParser.TypedefContext ctx) { 
		System.out.printf("" + ctx.getText());
			
	}
	@Override public void exitTypedef(WebIDLParser.TypedefContext ctx) { 
		System.out.printf("" + ctx.getText());
		
	}

	@Override public void enterType(WebIDLParser.TypeContext ctx) { 
		if (ctx.getText().equalsIgnoreCase("DOMString"))
		System.out.printf("String"+" ");
		else
			System.out.printf("" + ctx.getText() + " ");
			
	}
	@Override public void exitType(WebIDLParser.TypeContext ctx) { 
		
	}
	
	
	@Override public void enterConstType(WebIDLParser.ConstTypeContext ctx) { 
	}
	@Override public void exitConstType(WebIDLParser.ConstTypeContext ctx) { 
	}
	
	
	@Override public void enterConst_(WebIDLParser.Const_Context ctx) { 
//		System.out.printf("static final"+" "+ctx.getChild(2)+" = ");
		System.out.printf("" + "static final int" + " "+ ctx.getChild(2)+" = ");
	}

	@Override public void exitConst_(WebIDLParser.Const_Context ctx) { 
//		System.out.printf("static final"+" "+ctx.getChild(2)+" = ");
	}
	
	@Override public void enterConstValue(WebIDLParser.ConstValueContext ctx) { 
	System.out.printf("" + ctx.getText() + "; \n");
	}

	@Override public void exitConstValue(WebIDLParser.ConstValueContext ctx) { }
	
	
}
