package com.dtv.middle.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dtv.middle.models.TestModel;

public interface TestRepo extends JpaRepository</*DashboardModel*/TestModel,Integer> {

	/*
	 * @Query(value = "SELECT * FROM dashboard WHERE IdUser = ?1", nativeQuery =
	 * true) List<DashboardModel> findUserByUserId(int userId);
	 */





}

