package com.tennis.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.tennis.dao.TennisDao;
import com.tennis.model.Fixture;
import com.tennis.model.Ground;
import com.tennis.model.NameSuper;
import com.tennis.model.Player;
import com.tennis.model.Result;
import com.tennis.model.Statistics;
import com.tennis.model.Team;
import com.tennis.model.VariousText;

@Transactional
@Repository("tennisDao")
public class TennisDaoImpl implements TennisDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Player getPlayer(int player_id) {
        return getSession().createQuery("FROM Player WHERE playerId = :playerId",Player.class)
        	.setParameter("playerId", player_id).uniqueResult();
    }

    @Override
    public List<Player> getAllPlayer() {
        return getSession().createQuery("FROM Player", Player.class).getResultList();
    }

    @Override
    public List<NameSuper> getNameSupers() {
        return getSession().createQuery("FROM NameSuper", NameSuper.class).getResultList();
    }

    @Override
    public List<Fixture> getFixtures() {
        return getSession().createQuery("FROM Fixture", Fixture.class).getResultList();
    }

    @Override
    public List<Result> getResults() {
        return getSession().createQuery("FROM Result", Result.class).getResultList();
    }

    @Override
    public List<VariousText> getVariousTexts() {
        return getSession().createQuery("FROM VariousText", VariousText.class).getResultList();
    }

    @Override
    public List<Statistics> getStatistics() {
        return getSession().createQuery("FROM Statistics", Statistics.class).getResultList();
    }

    @Override
    public List<Team> getAllTeams() {
        return getSession().createQuery("FROM Team", Team.class).getResultList();
    }

    @Override
    public Team getTeam(int teamId) {
        return getSession().createQuery("FROM Team WHERE teamId = :teamId",Team.class)
        	.setParameter("teamId", teamId).uniqueResult();
    }

    @Override
    public List<Ground> getGround() {
        return getSession().createQuery("FROM Ground", Ground.class).getResultList();
    }
}