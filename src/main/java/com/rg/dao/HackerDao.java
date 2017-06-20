package com.rg.dao;

import java.util.List;

import org.apache.ignite.IgniteCache;
import org.apache.ignite.cache.query.QueryCursor;
import org.apache.ignite.cache.query.ScanQuery;
import org.springframework.beans.factory.annotation.Autowired;

import com.rg.bo.HackerBo;

public class HackerDao {

	@Autowired
	IgniteCache<Integer, HackerBo> hackerCache;

	public List<HackerBo> getForName(String name){

	}

}
