package com.dharmpal.collection;

public class TestMyOwnHashMap {
	public static void main(String[] args) 
	   {
		   OwnHashMap m=new OwnHashMap();
		   m.put("Deepak","Searching Job");
		   m.put("Chandu","DataTemplet");
		   m.put("Ankit","Tecleaver");
		   m.put("Sumit","Netzelous");
		   m.put("null","Software");
		   m.put("null","Software");
		   
		   OwnHashMap.Entry e=m.get("Deepak");
		   System.out.println(e.getValue());
	   }
	}
	/**************************************/
	class OwnHashMap
	{
		private int size;
		private static Entry[] element;
		int index;

		public OwnHashMap() 
		{
			size = 20;
			element = new Entry[size];
		}
		
		public void put(String key,String value)
		{
			Entry entry= new Entry(key, value);
			if (key == null)
			{	return;}
			
			int hash = hash(key.hashCode());
			//System.out.println(hash);
		
			int i = indexFor(hash, element.length);
			
			Entry e = element[i];
			
			if (e != null)
			{
				if (e.key.equals(key))
				{
					e.value = value;
				} 
				else 
				{
					while (e.next != null)
					{
						e = e.next;
					}
					e.next = entry;
				}
			}
			else 
			{
				element[i] = entry;
			}	
		}
		
	   static class Entry
	   {
			final String key;
			String value;
			Entry next;

			public Entry(String key, String value)
			{
				this.key = key;
				this.value = value;
			}

			public String getValue() 
			{
				return value;
			}

			public void setValue(String value)
			{
				this.value = value;
			}

			public String getKey() 
			{
				return key;
			}
		}
		
		public Entry get(String key) 
		{
			if (key == null)
				return null;
			int hash = hash(key.hashCode());
			int i = indexFor(hash, element.length);
			Entry e = element[i];
			while (e != null) 
			{
				if (e.key.equals(key))
				{
					return e;
				}
				e = e.next;
			}
			return null;
		}
		
		static int hash(int h) 
		{
			h ^= (h >>> 20) ^ (h >>> 12);
			System.out.println(h);
			return h ^ (h >>> 7) ^ (h >>> 4);
		}

		static int indexFor(int h, int length)
		{
			return h & (length - 1);
		}

}
