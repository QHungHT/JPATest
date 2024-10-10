package qh.synji.services;

import java.util.List;

import qh.synji.dao.IVideoDao;
import qh.synji.dao.VideoDao;
import qh.synji.entity.Video;

public class VideoService implements IVideoService {
    private final IVideoDao videoDao = new VideoDao();

    @Override
    public void insert(Video video) {
        videoDao.insert(video);
    }

    @Override
    public void update(Video video) {
        videoDao.update(video);
    }

    @Override
    public void delete(String videoId) throws Exception {
        videoDao.delete(videoId);
    }

    @Override
    public Video findById(String videoId) {
        return videoDao.findById(videoId);
    }

    @Override
    public List<Video> findByTitle(String title) {
        return videoDao.findByTitle(title);
    }

    @Override
    public List<Video> findAll() {
        return videoDao.findAll();
    }

    @Override
    public List<Video> findAll(int page, int pagesize) {
        return videoDao.findAll(page, pagesize);
    }

    @Override
    public int count() {
        return videoDao.count();
    }
}
