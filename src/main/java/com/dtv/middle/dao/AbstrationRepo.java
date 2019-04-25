package com.dtv.middle.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dtv.middle.models.GuiModel;

public interface AbstrationRepo extends JpaRepository<GuiModel, Integer> {

}
