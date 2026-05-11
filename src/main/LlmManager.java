package main;

public final class LlmManager {
    public void run() {
        var wordsFuture = new WordCounter().run();

        try {
            var words = wordsFuture.get();

            for (var word : words) {
                IO.println(word);
            }
        } catch (Exception exception) {
            IO.println(exception);
        }
    }
}
