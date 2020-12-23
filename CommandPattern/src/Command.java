public abstract class Command {

    //This is the "Command" class which acts as the common interface between all concrete commands


    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    //An abstract execution method so all concrete command needs to provide own implementation
    //Will return ture or false depending on editor state
    public abstract boolean execute();
}