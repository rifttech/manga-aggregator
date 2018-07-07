package com.github.rifttech.manga.agregator;

import com.github.rifttech.manga.agregator.api.Manga;
import com.github.rifttech.manga.agregator.api.MangaFetcher;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Slf4j
public class Application {
    public static void main(String[] args) {
        log.info("Starting 'Manga Aggregator'");
         StreamSupport
                .stream(ServiceLoader.load(MangaFetcher.class).spliterator(), false)
                .map(MangaFetcher::fetch)
                .flatMap(List::stream)
                .limit(10)
                .collect(Collectors.toList())
                .forEach(s-> {
                    log.info("------ Manga info -------");
                    log.info("Title: {}", s.getTitle());
                    log.info("-------------------------");
                });



        log.info("Shutdown 'Manga Aggregator'");
    }
}
