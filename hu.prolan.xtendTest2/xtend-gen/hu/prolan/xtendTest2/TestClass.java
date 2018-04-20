package hu.prolan.xtendTest2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class TestClass {
  public PrintStream testFunction() {
    return System.out.printf("hello world\n");
  }
  
  public List<String> test2() {
    List<String> _xblockexpression = null;
    {
      final ArrayList<String> list = new ArrayList<String>();
      final Function1<String, String> _function = (String s) -> {
        return (s + "1");
      };
      _xblockexpression = ListExtensions.<String, String>map(list, _function);
    }
    return _xblockexpression;
  }
}
