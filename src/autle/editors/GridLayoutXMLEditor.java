package autle.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class GridLayoutXMLEditor extends TextEditor {

	private ColorManager colorManager;

	public GridLayoutXMLEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
