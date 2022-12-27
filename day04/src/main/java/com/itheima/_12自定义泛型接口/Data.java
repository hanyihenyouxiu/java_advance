package com.itheima._12自定义泛型接口;

/**
 * Created with IntelliJ IDEA.
 * User: 寒毅
 * Date: 2022/12/27
 * Time: 14:56
 * Description:
 *
 * @author 寒毅
 */
public interface Data<T> {

    void add(T t);

    void delete(T t);

    void update(T t);

    void search(int id);
}
