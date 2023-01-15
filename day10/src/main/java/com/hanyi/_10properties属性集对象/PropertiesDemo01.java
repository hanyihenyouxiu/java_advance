package com.hanyi._10properties属性集对象;

/**
 * 目标：Properties的概述和使用
 *
 * Properties：属性集对象。
 * 其实就是一个Map集合。也就是一个键值对集合，但是欧文一般不会当集合使用，因为有HashMap。
 * Properties核心作用：
 *      Properties代表的是一个属性文件，可以把键值对的数据存入到一个属性文件中去。
 *      属性文件：后缀是.Properties结尾的文件，里面的内容都是key=value
 *
 * Properties的方法：
 * -- public Object setProperty(String key, String value)：保存一对属性。
 * -- public String getProperties(String key)：使用次属性列表中指定的键搜索属性值。
 * -- public Set<String> stringPropertiesNames()：所有键的名称的集合
 * -- public void store(OutputStream out, String comments)：保存数据到属性文件中去。
 * -- public void store(Writer fw, String comments)：保存数据到属性文件中去。
 */
public class PropertiesDemo01 {
}
