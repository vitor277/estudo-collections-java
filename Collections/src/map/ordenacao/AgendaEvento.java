package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * AgendaEvento
 */
public class AgendaEvento {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap); 
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap); 
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento é " + entry.getValue() + " e acontecerá dia " + entry.getKey());
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        AgendaEvento agendaEvento  = new AgendaEvento();
        agendaEvento.adicionarEvento(LocalDate.of(2024, 05, 22), "Evento 1", "Atração 1");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.MAY, 25), "Evento 2", "Atração 2");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 15), "Evento 3", "Atração 3");

        agendaEvento.exibirAgenda();
        agendaEvento.obterProximoEvento();
    }
    
}