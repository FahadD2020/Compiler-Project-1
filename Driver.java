import java.io.File;
import java.io.FileInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

public class Driver{
    public static void main(String[] args) throws Exception {
        
        // import
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        // Little
        LittleLexer lexer = new LittleLexer(input);
        Token tik = lexer.nextToken();
        // the vocabulary from file
        Vocabulary v = lexer.getVocabulary();
        // token gets
        while(tik.getType() != tik.EOF) {
            // print type and name
            System.out.println("Token Type: "+v.getSymbolicName(tik.getType()));
            // the value 
            System.out.println("Value: "+tik.getText());
            // next line
            tik = lexer.nextToken();
        }
        
    }
}