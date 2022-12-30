package com.itheima._04Set系列集合的使用;

/**
 * 目标：LinkedHashSet
 *
 * 是HashSet的子类，元素是”有序“不重复，无索引。
 *
 * LinkedHashSet底层依然使用哈希表存储元素。
 * 但是每个元素都额外带一个链来维护添加顺序！
 * 不光增删查快，还有序。缺点是多了一个存储排序的链会占内存空间！而且不允许重复，无索引。
 *
 * 总结：
 *  如果希望元素可以重复，又有索引，查询要快用ArrayList集合。
 *  如果希望元素可以重复，又有索引，增删要快要用LinkedList集合。
 *  如果希望元素增删改查都很快，但是元素不重复以及无需无索引，那么用HashSet集合。
 *  如果希望元素增删改查都很快并且有序，但是元素不重复以及无索引，那么用LinkedHashSet集合。
 */
public class HashSetDemo04 {

}
