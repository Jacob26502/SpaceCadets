
import java.io.*;
import java.net.URL;
import static java.util.stream.Collectors.*;
public class nameGetter {public static void main(String[] args) throws IOException{ String ss= (new BufferedReader(new InputStreamReader((new URL("https://www.ecs.soton.ac.uk/people/" + new BufferedReader(new InputStreamReader(System.in)).readLine())).openStream())).lines().collect(joining()));System.out.print(ss.substring((ss.indexOf("property=\"name\">")+16),ss.indexOf("<em property=\"honorificSuffix\"")));}}
