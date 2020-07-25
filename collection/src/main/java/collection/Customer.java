package collection;

import java.util.Arrays;

public class Customer<E>
{
	private int size = 0;
	private int capacity = 10;
	private Object list[];
	public Customer()
	{
		list = new Object[capacity];
	}
	public void print()
	{
		System.out.print("[");
		for(int i=0;i<size;i++)
		{
			System.out.print(list[i]);
			if(i!=size-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	public E fetch(int index)
	{
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("Out of Bounds");
		return (E) list[index];
	}
	public void add(E element)
	{
		if(size==capacity)
			tableDoubling();
		list[size++] = element;
	}
	public void remove(int index)
	{
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("Out of Bounds");
		if(index==size-1)
			list[index] = null;
		else
		{
			for(int i=index;i<size-1;i++) 
			{
				list[i] = list[i+1];
			}
			list[size-1] = null;
		}
		size--;
		
	}
	private void tableDoubling()
	{
		capacity *= 2;
		list = Arrays.copyOf(list, capacity);
	}
	public int getSize() 
	{
		return size;
	}
	public void setSize(int size) 
	{
		this.size = size;
	}
	public int getCapacity() 
	{
		return capacity;
	}
	public void setCapacity(int capacity) 
	{
		this.capacity = capacity;
	}
	public Object[] getList() 
	{
		return list;
	}
	public void setList(Object[] list) 
	{
		this.list = list;
	}
}
