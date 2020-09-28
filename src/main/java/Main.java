import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Хотите добавить дополнить словарь?");
            System.out.println("Введите фразу или end, если хотите выйти");

            String input = scanner.nextLine();

            if (input.equals("end")){
                break;
            }

            Function<String, List<String>> toDict = s -> Arrays.stream(s.trim().split(" "))
                    .collect(Collectors.toList());

            dictionary.addAll(toDict.apply(input));
            dictionary.stream().sorted().forEach(System.out::println);
        }

    }
}