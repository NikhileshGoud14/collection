package collection;
import java.util.Arrays;
public class List<A>
{
	private int size = 0;
    private static final int buffer = 10;
    private Object elements[];
    public List()
    {
        elements = new Object[buffer];
    }
    public void add(A e)
    {
        if (size == elements.length)
        {
            ensureCapacity();
        }
        elements[size++] = e;
    }
    public A get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (A) elements[i];
    }
    public A remove(int i) 
    {
        if (i >= size || i < 0)
        {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        size--;
        return (A)item;
    }
    public int size() {
        return size;
    }
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++)
         {
             sb.append(elements[i].toString());
             if(i<size-1)
             {
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }  
    private void ensureCapacity()
    {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
