package com.cn.cooxin.admin.service;
import java.util.List;
import java.util.Map;

import com.cn.cooxin.admin.entity.*;
import com.cn.cooxin.code.entity.Dict;
import com.cn.cooxin.code.entity.Partion;


/**
 * Service(字典数据)
 * @author airufei
 * @version 2017-02-26
 */
 @SuppressWarnings("all")
public interface IDictService {
	
	/**
	 * 删除数据（逻辑删除）
	 * @param question
	 * @return
	 */
	public void delete(long id);
    /**
	 * 单条数据增加
	 * @param dict
	 * @return
	 */
	public Dict add(Dict dict);

    /**
	 * 批量数据增加
	 * @param dict
	 * @return
	 */
	 public void addTrainRecordBatch(List<Dict> list);

     /**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	 public Dict getDictById (long id);

     /**
	 * 修改单条数据
	 * @param id
	 * @return
	 */
	  public void updateById(Dict dict);

	  /**
	   * 获取分页数据
	   * @param map
	   * @return
	   */
	   public Partion  getList(Map map);
	   
	   /**
	   * 获取集合数据，不带分页
	   * @param map
	   * @return
	   */
	   public List<Dict>  getDictList(Dict dict);
	   
	   /**
	   * 获取分页总数
	   * @param map
	   * @return
	   */
	   public int  getTotalCount(Map map);
	
}