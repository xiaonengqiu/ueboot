package com.ueboot.core.jpa.repository;

import java.io.Serializable;

/**
 *
 * @author xiangli.ma
 * @date 2018/7/21
 * @since 1.0
 */
public interface JpaRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {

}
