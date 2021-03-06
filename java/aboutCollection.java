import java.util.*;

/**
 * 集合
 *  Collection -> [Map<K,V>, List<E>, Set<E>]
 *
 *      Map 键值对应类型
 *      Map -> HashMap<K,V>
 *      Map -> TreeMap<K,V>
 *
 *      List 有序类型,可重复
 *      List -> LinkedList<E>
 *      List -> ArrayList<E>
 *
 *      Set 无序类型(以hash码排列) 不能重复
 *      Set -> HashSet<E>
 *      Set -> TreeSet<E>
 *
 */
public class aboutCollection {
    aboutCollection() {

        //泛型写法
        List list1 = new ArrayList();

        //指定类型写法
        List<Integer> list2 = new ArrayList<>();

        /**
         * ArrayList 对比 LinkedList
         *
         * ArrayList
         * 优点: 快速访问
         * 缺点: 修改慢
         *
         * LinkedList
         * 优点: 修改快
         * 缺点: 访问慢
         */
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();


        /**
         * HashSet 对比 TreeSet
         *
         * HashSet
         * 哈希排列
         *
         * TreeSet
         * 树型hash排列,值的类型不能混合
         *
         */
        Set hashSet = new HashSet();

        Set treeSet = new TreeSet();

        /**
         * HashMap TreeMap
         *
         * HashMap
         *
         * TreeMap
         *
         */


        /**
         * (摘自 http://www.runoob.com/java/java-collections.html)
         * 1	AbstractCollection
         * 实现了大部分的集合接口。
         *
         * 2	AbstractList
         * 继承于AbstractCollection 并且实现了大部分List接口。
         *
         * 3	AbstractSequentialList
         * 继承于 AbstractList ，提供了对数据元素的链式访问而不是随机访问。
         *
         * 4	LinkedList
         * 该类实现了List接口，允许有null（空）元素。主要用于创建链表数据结构，该类没有同步方法，如果多个线程同时访问一个List，
         * 则必须自己实现访问同步，解决方法就是在创建List时候构造一个同步的List。例如：
         *
         * Listlist=Collections.synchronizedList(newLinkedList(...));
         * LinkedList 查找效率低。
         *
         * 5	ArrayList
         * 该类也是实现了List的接口，实现了可变大小的数组，随机访问和遍历元素时，提供更好的性能。该类也是非同步的,
         * 在多线程的情况下不要使用。ArrayList 增长当前长度的50%，插入删除效率低。
         *
         * 6	AbstractSet
         * 继承于AbstractCollection 并且实现了大部分Set接口。
         *
         * 7	HashSet
         * 该类实现了Set接口，不允许出现重复元素，不保证集合中元素的顺序，允许包含值为null的元素，但最多只能一个。
         *
         * 8	LinkedHashSet
         * 具有可预知迭代顺序的 Set 接口的哈希表和链接列表实现。
         *
         * 9	TreeSet
         * 该类实现了Set接口，可以实现排序等功能。
         *
         * 10	AbstractMap
         * 实现了大部分的Map接口。
         *
         * 11	HashMap
         * HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
         * 该类实现了Map接口，根据键的HashCode值存储数据，具有很快的访问速度，最多允许一条记录的键为null，不支持线程同步。
         *
         * 12	TreeMap
         * 继承了AbstractMap，并且使用一颗树。
         *
         * 13	WeakHashMap
         * 继承AbstractMap类，使用弱密钥的哈希表。
         *
         * 14	LinkedHashMap
         * 继承于HashMap，使用元素的自然顺序对元素进行排序.
         *
         * 15	IdentityHashMap
         * 继承AbstractMap类，比较文档时使用引用相等。
         */



        System.out.println(linkedList);
    }
}
