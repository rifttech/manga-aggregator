package com.github.rifttech.manga.agregator.api;

import java.util.List;

public interface MangaFetcher {
    List<Manga> fetch() throws RuntimeException;
}
