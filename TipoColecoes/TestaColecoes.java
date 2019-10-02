import java.io.*;
import java.util.*;

public class TestaColecoes {
public static void main(String[] args) {
if(args.length <  3) {
sintaxe();
}

try{
BufferedReader arqDados = new BufferedReader(new FileReader(args[1]));
BufferedReader arqPesquisa = new BufferedReader(new FileReader(args[2]));
if(args[0].equals("-v")) {
testaColecao(new ArrayList(), arqDados, arqPesquisa);
} else if(args[0].equals("-le")) {
testaColecao(new LinkedList(), arqDados, arqPesquisa);
} else if(args[0].equals("-hs")){
testaColecao(new HashSet(), arqDados, arqPesquisa);
} else if(args[0].equals("-ts")) {
testaColecao(new TreeSet(), arqDados, arqPesquisa);
} else if(args[0].equals("-hm")) {
testaMapa(new HashMap(), arqDados, arqPesquisa);
} else if(args[0].equals("-tm")) {
testaMapa(new TreeMap(), arqDados, arqPesquisa);
} else {
sintaxe();
}
}catch(IOException e){

System.err.println(e);
System.exit(1);
}

}
static void sintaxe() {
System.err.println("Sintaxe: TestaColecoes [-v|-le|-hs|-ts|-hm|-tm] arquivoDados arquivoAPesquisar");
System.exit(1);
}

static void testaColecao(Collection colecao, BufferedReader
arqDados, BufferedReader arqPesquisa) throws IOException {

long init = System.currentTimeMillis();
carregaColeção(colecao, arqDados);
long fimCarga = System.currentTimeMillis();
int numAchados = pesquisaColeção(colecao, arqPesquisa);
long fimPesquisa = System.currentTimeMillis();
System.out.println("Elementos achados usando" + colecao.getClass().getName() + ":" + numAchados);
System.out.println("Carga de dados demorou:" + ((fimCarga -
init)/1000.0) + "segundos");
System.out.println("Pesquisa de dados demorou:" +
((fimPesquisa - fimCarga)/1000.0) + " segundos");
System.out.println("Total de tempo" + ((fimPesquisa -
init)/1000.0) + " segundos");
}

static void carregaColeção(Collection colecao, BufferedReader
arqDados) throws IOException {
String linha;
while((linha = arqDados.readLine()) != null) {
colecao.add(linha);
}
}

static int pesquisaColeção(Collection colecao, BufferedReader
arqPesquisa) throws IOException {
String linha;
int numAchados = 0;
while((linha = arqPesquisa.readLine()) != null) {
if(colecao.contains(linha)) {
numAchados++;
}
}
return numAchados;
}

static void testaMapa(Map mapa, BufferedReader arqDados,
BufferedReader arqPesquisa) throws IOException {
long init = System.currentTimeMillis();
carregaMapa(mapa, arqDados);
long fimCarga = System.currentTimeMillis();
int numAchados = pesquisaMapa(mapa, arqPesquisa);
long fimPesquisa = System.currentTimeMillis();
System.out.println("Elementos achados usando" +
mapa.getClass().getName() + ":" + numAchados);
System.out.println("Carga de dados demorou" + ((fimCarga -
init)/1000.0) + "segundos");
System.out.println("Pesquisa de dados demorou" +
((fimPesquisa - fimCarga)/1000.0) + "segundos");
System.out.println("Total de tempo" + ((fimPesquisa -init)/1000.0) + "segundos");
}

static void carregaMapa(Map mapa, BufferedReader arqDados)
throws IOException {
String linha;
while((linha = arqDados.readLine()) != null) {
StringTokenizer st = new StringTokenizer(linha, ":");
String chave = st.nextToken();
mapa.put(chave, st.nextToken());
}
}
static int pesquisaMapa(Map mapa, BufferedReader arqPesquisa)
throws IOException {
String linha;
int numAchados = 0;
while((linha = arqPesquisa.readLine()) != null) {
StringTokenizer st = new StringTokenizer(linha, ":");
String chave = st.nextToken();
if(mapa.get(chave) != null) {
numAchados++;
}
}
return numAchados;
}
}
