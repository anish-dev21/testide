package com.example.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import org.jetbrains.annotations.NotNull;

public class FloatingSuggestionAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        // Get the editor and selected text
        Editor editor = event.getData(com.intellij.openapi.actionSystem.CommonDataKeys.EDITOR);

        if (editor == null) {
            return; // No active editor
        }

        SelectionModel selectionModel = editor.getSelectionModel();
        String selectedText = selectionModel.getSelectedText();

        if (selectedText != null && !selectedText.isEmpty()) {
            // Simulate a suggestion (replace this with real LangChain/OpenAI integration later)
            String suggestion = "Suggestion: Consider refactoring this code for clarity.";

            // Display the suggestion in a floating popup
            JBPopupFactory.getInstance()
                    .createMessage(suggestion)
                    .showInBestPositionFor(editor);
        }
    }
}
