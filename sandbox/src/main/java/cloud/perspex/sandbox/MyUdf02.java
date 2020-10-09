package cloud.perspex.sandbox;

import org.apache.drill.exec.expr.DrillSimpleFunc;
import org.apache.drill.exec.expr.annotations.FunctionTemplate;
import org.apache.drill.exec.expr.annotations.Output;
import org.apache.drill.exec.expr.annotations.Param;
import org.apache.drill.exec.expr.holders.NullableVarCharHolder;

@FunctionTemplate(
        name="isit02",
        scope= FunctionTemplate.FunctionScope.SIMPLE,
        nulls = FunctionTemplate.NullHandling.NULL_IF_NULL
)
public class MyUdf02 implements DrillSimpleFunc {

    @Param
    NullableVarCharHolder input;

    @Output
    NullableVarCharHolder output;
    
	public void setup() {
		
	}

	public void eval() {
		
	    output = input;
	
	}

}

