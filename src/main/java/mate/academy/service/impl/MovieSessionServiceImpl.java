package mate.academy.service.impl;

import mate.academy.model.MovieSession;
import mate.academy.service.MovieSessionService;
import java.time.LocalDate;
import java.util.List;
import mate.academy.lib.Service;
import mate.academy.lib.Inject;
import mate.academy.dao.MovieSessionDao;

@Service
public class MovieSessionServiceImpl implements MovieSessionService {

    @Inject
    private MovieSessionDao movieSessionDao;

    @Override
    public MovieSession add(MovieSession movieSession) {
        return movieSessionDao.add(movieSession);
    }

    @Override
    public MovieSession get(Long id) {
        return movieSessionDao.get(id);
    }

    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
        return movieSessionDao.findAvailableSessions(movieId, date);
    }
}
