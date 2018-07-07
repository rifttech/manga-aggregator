package com.github.rifttech.fetcher.plugin.mangaeden;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class MangaCollection {
    private int end;
    private int page;
    private int start;
    private int total;
    private List<MangaInfo> manga;
}
