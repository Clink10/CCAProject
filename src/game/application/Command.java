package game.application;

import game.application.exceptions.InvalidCommandException;

public enum Command {
    GO,
    HELP,
    LOOK,
    TAKE,
    QUIT,
    USE,
    YES,
    NO,
    INVALID;

    /**
     * 
     * @param sCommand
     * @return Command
     * @throws game.application.InvalidCommandException
     */
    public static Command getCommand(String sCommand) throws InvalidCommandException{
        
        String s;
        if(sCommand.split(" ")[0].length() > 3) {
            s = sCommand.split(" ")[0].substring(0, 3);
        }
        else {
            s = sCommand.split(" ")[0];
        }
        
        String cmd = s.toUpperCase();
        Command c;
        
        switch(cmd) {
            
            case "GO":
                c = Command.GO;
                break;
            case "HEL":
                c = Command.HELP;
                break;
            case "LOO":
                c = Command.LOOK;
                break;
            case "TAK":
                c = Command.TAKE;
                break;
            case "QUI":
                c = Command.QUIT;
                break;
            case "USE":
                c = Command.QUIT;
                break;    
            case "YES":
                c = Command.YES;  
                break;
            case "NO":
                c = Command.NO;
                break;
            default:
                c = Command.INVALID;
                break;
        }
        
        if(c == Command.INVALID) {
            throw new InvalidCommandException();
        }
        
        return c;
    }
    
    
    /**
     * 
     * @param s
     * @return 
     */
    public static String[] getParameters(String s){
       return s.split(" ");
    }
}