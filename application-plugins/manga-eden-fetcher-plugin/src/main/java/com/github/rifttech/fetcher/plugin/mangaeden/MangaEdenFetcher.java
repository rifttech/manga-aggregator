package com.github.rifttech.fetcher.plugin.mangaeden;

import com.github.rifttech.manga.agregator.api.Manga;
import com.github.rifttech.manga.agregator.api.MangaFetcher;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class MangaEdenFetcher implements MangaFetcher {
    @Override
    public List<Manga> fetch() throws RuntimeException {
        log.info("fetching manga from 'Manga Eden'");

        final InputStream is = this.getClass().getClassLoader().getResourceAsStream("eden-manga.json");

        final Gson gson = new GsonBuilder().create();

        MangaCollection mangaCollection = gson.fromJson(new InputStreamReader(is), MangaCollection.class);
        log.info("mangas fetched: {}", mangaCollection.getTotal());

        return mangaCollection.getManga().stream().map(s-> new Manga(s.getTitle())).collect(Collectors.toList());
    }
}
