package com.ijys.bootsample.multipartsample.model.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Getter
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "preferences")
public class PreferencesValues {
    private final Uploader uploader;

    @Getter
    @RequiredArgsConstructor
    public static class Uploader {
        private final String path;
    }
}

