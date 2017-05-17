package com.xiami.mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public interface SqlMapper {


    /**
     * Select one map.
     *
     * @param sql the sql
     * @return the map
     */
    Map<String, Object> selectOne(String sql);

    /**
     * Select one map.
     *
     * @param sql   the sql
     * @param value the value
     * @return the map
     */
    Map<String, Object> selectOne(String sql, Object value);

    /**
     * Select one t.
     *
     * @param <T>        the type parameter
     * @param sql        the sql
     * @param resultType the result type
     * @return the t
     */
    <T> T selectOne(String sql, Class<T> resultType);

    /**
     * Select one t.
     *
     * @param <T>        the type parameter
     * @param sql        the sql
     * @param value      the value
     * @param resultType the result type
     * @return the t
     */
    <T> T selectOne(String sql, Object value, Class<T> resultType);

    /**
     * Select list list.
     *
     * @param sql the sql
     * @return the list
     */
    List<Map<String, Object>> selectList(String sql);

    /**
     * Select list list.
     *
     * @param sql   the sql
     * @param value the value
     * @return the list
     */
    List<Map<String, Object>> selectList(String sql, Object value);

    /**
     * Select list list.
     *
     * @param <T>        the type parameter
     * @param sql        the sql
     * @param resultType the result type
     * @return the list
     */
    <T> List<T> selectList(String sql, Class<T> resultType);

    /**
     * Select list list.
     *
     * @param <T>        the type parameter
     * @param sql        the sql
     * @param value      the value
     * @param resultType the result type
     * @return the list
     */
    <T> List<T> selectList(String sql, Object value, Class<T> resultType);

    /**
     * Insert int.
     *
     * @param sql the sql
     * @return the int
     */
    int insert(String sql);

    /**
     * Insert int.
     *
     * @param sql   the sql
     * @param value the value
     * @return the int
     */
    int insert(String sql, Object value);

    /**
     * Update int.
     *
     * @param sql the sql
     * @return the int
     */
    int update(String sql);

    /**
     * Update int.
     *
     * @param sql   the sql
     * @param value the value
     * @return the int
     */
    int update(String sql, Object value);

    /**
     * Delete int.
     *
     * @param sql the sql
     * @return the int
     */
    int delete(String sql);

    /**
     * Delete int.
     *
     * @param sql   the sql
     * @param value the value
     * @return the int
     */
    int delete(String sql, Object value);

}
