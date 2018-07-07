package com.github.rifttech.fetcher.plugin.mangaeden;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;
import java.util.stream.StreamSupport;

/**
 *     {
 *       "a": "has-the-rain-stopped",
 *       "c": [
 *         "Fantasy",
 *         "Seinen",
 *         "Supernatural"
 *       ],
 *       "h": 26,
 *       "i": "5aa9b638719a1652eae2652d",
 *       "im": "e3/e3c0dbd44eecf6f9018ad2aec33391159355b0193d0cb603a3bbff03.png",
 *       "ld": 1521150781.0,
 *       "s": 2,
 *       "t": "Has the rain stopped?"
 *     },
 *     Returned data:
 * dictionaries in the key "manga" contains the manga's image ("im"), title ("t"), ID ("i"), alias ("a"),
 *  status ("s"), category ("c"), last chapter date ("ld"), hits ("h")
 */
@Data
public class MangaInfo {
    @SerializedName("im")
    private String image;
    @SerializedName("t")
    private String title;
    @SerializedName("ID")
    private String id;
    @SerializedName("a")
    private String alias;
    @SerializedName("s")
    private String status;
    @SerializedName("c")
    private List<String> category;
    @SerializedName("ld")
    private String lastChapterDate;
    @SerializedName("h")
    private String hits;
}
