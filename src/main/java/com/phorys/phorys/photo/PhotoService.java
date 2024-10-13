package com.phorys.phorys.photo;

import com.phorys.phorys.user.SiteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PhotoService {

    private final PhotoRepository photoRepository;

    public List<Photo> getAllPhotos(){
        return new ArrayList<>();
    }
}
