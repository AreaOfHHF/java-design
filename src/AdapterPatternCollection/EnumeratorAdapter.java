package AdapterPatternCollection;

import javax.print.attribute.standard.NumberUpSupported;
import java.util.Enumeration;
import java.util.Iterator;

public class EnumeratorAdapter implements Iterator{

    Enumeration enumeration;

    public EnumeratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
