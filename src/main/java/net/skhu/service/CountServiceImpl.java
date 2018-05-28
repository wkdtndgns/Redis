package net.skhu.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.domain.Count;
import net.skhu.repository.CountRepository;

/**
 * Created by ds on 2018-04-09.
 */

@Service
public class CountServiceImpl implements CountService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CountRepository countRepository;

    @Override
    public Count findById(final String id) {
        Optional<Count> count = countRepository.findById(id);
        if(!count.isPresent()) return null;
        else {
            return count.get();
        }
    }


    @Override
    public void saveCount(final Count count) {
        countRepository.save(count);
    }

    @Override
    public void deleteCount(final String id) {
        countRepository.deleteById(id);
    }
}
