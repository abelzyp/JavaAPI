    public interface Inteator {
        boolean hasNext();
        Object next(); 
    }
    
    public interface Iterable {
        Iterator iterator();
    }
    
    public interface Collection extends Iterable {//Collection接口继承Iterable接口，不实现
        Iterator iterator();
    }
    
    public interface List extends Collection {//List接口继承Collection接口，不实现
        Iterator iterator();
    }
    
    public class ArrayList implements List {//ArrayList类实现List接口，到这里才把迭代器中方法实现
        public Iterator iterator() {
            return new Itr();
        }
        
        private class Itr implements Iterator {//最后这里是通过内部类方式实现
            public boolean hasNext() {}
            public Object next(){} 
        }
    }
    
    
    Collection c = new ArrayList();
    c.add("hello");
    c.add("world");
    c.add("java");
    Iterator it = c.iterator();	 //new Itr();
    while(it.hasNext()) {
        String s = (String)it.next();
        System.out.println(s);
    }