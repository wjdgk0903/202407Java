package p439;

import org.graalvm.compiler.nodes.StaticDeoptimizingNode;

import p439.Button.OnClickListener;

public class Button {
	public interface OnClickListener {

	}

	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
		
	static interface OnClickListener{
		void onClick();
	}
	}

}
