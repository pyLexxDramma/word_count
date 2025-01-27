import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String text = "hello world hello java world hello";
        String wordToCount = "hello"; // Слово, которое нужно подсчитать

        int count = countWordOccurrences(text, wordToCount);
        System.out.println("Количество слов '" + wordToCount + "': " + count);
    }

    public static int countWordOccurrences(String text, String word) {
        // Создаем HashMap для хранения слов и их количества
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Разбиваем строку на слова
        String[] words = text.split(" ");

        // Подсчитываем количество каждого слова
        for (String w : words) {
            w = w.toLowerCase(); // Приводим к нижнему регистру для учета регистра
            wordCountMap.put(w, wordCountMap.getOrDefault(w, 0) + 1);
        }

        // Возвращаем количество конкретного слова
        return wordCountMap.getOrDefault(word.toLowerCase(), 0);
    }
}
