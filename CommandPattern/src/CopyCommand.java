public class CopyCommand extends Command {

    //Has role of a sender

    public CopyCommand(Editor editor) {
        super(editor);
    }

    //The "CopyCommand" execute implementation
    //Hostory not added since state of current text is untouched
    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
