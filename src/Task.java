import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

public class Task {

    /**
     * Метод в качестве параметра принимает год, месяц и день в котором ты родился.
     * Ваша задача выяснить какой это день дни недели(Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Вторник).
     * Примечание: Месяц = 30
     *
     * @param year  = 2000
     * @param month = 11
     * @param day   = 8
     * @return "Среда"
     */

    public String getWeekOfDay(int year, int month, int day) {

        return  String.valueOf(LocalDate.of(year, month, day).getDayOfWeek());
    }

    /**
     * Метод в качестве параметра берет два массива, вам слить элементы этих массивов,
     * потом сортировать и найти медиану.
     *
     * @param array       = {1,3}
     * @param secondArray = {2}
     * Объединенный массив = {1, 2,3}
     * @return 2;
     *
     * @param array       = {1,2}
     * @param secondArray = {3,4}
     * Объеденный массив = {1,2,3,4} и медиана (2+3) / 2 = 2.5;
     * @return 2.5
     */
    public double method1(int[] array, int[] secondArray) {
        int merid = 0;
        List<Integer> integerList = new ArrayList<>();
        for (Integer i: array) {
            integerList.add(i);
        }
        for (Integer i: secondArray) {
            integerList.add(i);
        }
        Collections.sort(integerList);

        if (integerList.size()%2 != 0) {
            merid = integerList.size() - integerList.size() / 2;


            //return integerList.stream().mapToInt(a -> a).average().orElse(0);
        }
        return integerList.get(merid) + integerList.get(merid + 1)/2 ;
    }

    /**
     * Метод в качестве параметра берет матрицу он же двойной массив,
     * вам надо написать метод таким образом, что элементы находится по диагонали должны отсортироваться.
     *
     * @param matrix = {{5,2,3},
     *               {4,9,6},
     *               {7,8,1}}
     * @return matrix = {{1,2,3},
     * {4,5,6},
     * {7,8,9}}
     */
    public int[][] getSortedArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }
        }
        return new int[0][0];
    }

    /**
     * Если в #longWord содержится строка #word, то нужно вернуть первый индекс
     * пересечения
     *
     * @param longWord - sadbutsad
     * @param word     - but
     * @return 3 - так как в стоке sadbutsad(sadBUTsad), but начинается с третьего индекса
     */
    public int getIndex(String longWord, String word) {
        int res = 0;
        if (longWord.contains(word)) {
            int sec = word.charAt(0);
            for (int i = 0; i < longWord.length(); i++) {
                char ch = longWord.charAt(i);
                if (sec == ch) {
                    res = i;
                }
            }
        }
        return res;
    }

    /**
     * В качестве параметра приходит массив строк,
     * ваша задача вернуть массив объектов, со строкой и его количеством
     *
     * @param text {ручка, телефон, книга, телефон, ручка, телефон}
     * @return {@link DuplicateWord} [{word=ручка,count=2},{word=телефон,count=3},{word=книга,count=1}]
     */
    public DuplicateWord[] getDuplicateWord(String[] text) {

        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text.length; j++) {
                if (text[i].equals(text[j])) {

                }
            }

        }

        return new DuplicateWord[0];
    }

    /**
     * Берет массив чисел, возвращает самое маленькое пропущенное значение
     *
     * @param numbers {1,2,3,5,6,8,12}
     * @return 4
     */
    public int getSmallestMissing(int[] numbers) {
        List<Integer> integerList = new ArrayList<>();
        for (Integer x: numbers) {
            integerList.add(x);
        }
        Collections.sort(integerList);
        int x = integerList.get(0);
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) == x){
                x++;
            } else {
                return x;
            }
        }
        return 0;
    }

    /**
     * Учитывая массив nums из различных целых чисел, верните все возможные перестановки, в виде двойного массива.
     *
     * @param nums - [1,2,3]
     * @return [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
     */
    public List<List<Integer>> permute(int[] nums) {

        return null;
    }

    /**
     * Учитывая массив строк, сгруппируйте анаграммы вместе.
     * <p>
     * Анаграмма - это слово или фраза, образованные путем перестановки букв другого слова или фразы,
     * обычно с использованием всех исходных букв ровно один раз.
     *
     * @param strs ["eat","tea","tan","ate","nat","bat"]
     * @return [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        return null;
    }

    /**
     * #n cтепень числа #x
     * Примечание. Не используем встроенные библиотеки джава
     *
     * @param x 2
     * @param n 10
     * @return 1024.00000
     */
    public double myPow(double x, int n) {
        double res = x;
        for (int i = 0; i < n; i++) {
                res = res*x;

        }
        return res/2;
    }

    static class DuplicateWord {
        String word;
        String count;
    }
}
