package com.dtv.middle.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.dtv.middle.models.GuiModel;
import com.dtv.middle.models.TestModel;

public interface GuiRepo extends JpaRepository<GuiModel, Integer> {

	@Query(value = "SELECT query FROM guimodel WHERE projectId = ?1 AND queryId=?2", nativeQuery = true)
	String findQueryByQueryId(int projectId, int queryId);

	@Transactional
	@Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "UPDATE guimodel SET query=?1 WHERE projectId = ?2 AND queryId=?3", nativeQuery = true)
	void updateQueryByQueryId(String query, int projectId, int queryId);

	@Transactional
	@Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "DELETE FROM guimodel  WHERE projectId = ?1 AND queryId=?2", nativeQuery = true)
	void deleteQueryByQueryId(int projectId, int queryId);

}
