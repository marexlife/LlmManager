package main;

import java.util.Vector;
import java.util.concurrent.CompletableFuture;

public final class WordCounter {
    private final Vector<Word> _words = new Vector<>();

    public CompletableFuture<Vector<Word>> run() {
        return CompletableFuture.supplyAsync(() -> {
            _words.add(new Word(""));

            return _words;
        });
    }
}
