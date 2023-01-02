import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import java.util.stream.Stream;

public class UsingOptional {
    public static void main(String[] args) {
        String s = "1";
        //Sem o uso de optional
        Integer numero = converteNumero(s);
        System.out.println(numero);

        String s1 = "";
        //Usando Optional.of
        //Quer dizer que pode existir um inteiro ou não
        Optional<Integer> numOpt = converteNumeroComOptional(s1);
        //repare que a saida não é um inteiro
        System.out.println(numOpt);
        numOpt.ifPresent(System.out::println);
        System.out.println(numOpt.orElse(3));
        System.out.println(numOpt.orElseGet(()->{
            try {
                return conexaoHTTP("https://jsonplaceholder.typicode.com/posts/");
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }));

        //lança uma exceção
        System.out.println(numOpt.orElseThrow(()->new NullPointerException("Valor vazio")));

        //Usando com Stream
        Stream.of(1,2,3).findFirst().ifPresent(System.out::println);
    }

    private static Integer conexaoHTTP(String url) throws IOException, InterruptedException {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(URI.create(url)).build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.statusCode();
    }

    private static Integer converteNumero(String s) {
        return Integer.parseInt(s);
    }

    private static Optional<Integer> converteNumeroComOptional(String s) {
        //tratando o optional
        try {

            return Optional.of(Integer.parseInt(s));
        } catch (Exception e) {

            return Optional.empty();

        }
    }
}
