# Java_projectwork con @cristianomarchesi

Abbiamo iniziato con il creare la classe madre Ammortamento implementando la
libreria java.util.Scanner, e quelle figlie Italiano, Francese e Tedesco sfruttando il
concetto di ereditarietà. Nel metodo main della classe Ammortamento abbiamo
introdotto i valori di input che manterremo costanti: il debito iniziale fissato in
600000€, la maturità fissata in 5 anni e il tasso di interesse annuale 2,5%. Nel
metodo main, che ricordiamo ha la particolarità di non restituire nulla, abbiamo
implementato una scansione della tastiera per scegliere che tipo di ammortamento
si vuole utilizzare. Per farlo abbiamo creato una nuova istanza della classe Scanner
e stampato a video la richiesta di scelta del tipo di ammortamento che andrà a
costituire la stringa che farà da switch tra le varie classi figlie. Dopo aver preparato
una semplice struttura per una più semplice e chiara lettura dell’ammortamento
attraverso una tabella, la struttura switch-case dirotta il compilatore alla corretta
classe figlia a seconda della stringa che viene data in input sulla tastiera. Il
compilatore scorre quindi tutti i casi finché non trova quello che si è verificato ed
esce dal ciclo (break). In particolare nel caso venga digitato Francese questo andrà
a creare una nuova istanza della classe Francese, nel caso venga digitato Tedesco
questo andrà a creare una nuova istanza della classe Tedesco e nel caso venga
digitato Italiano verrà creata una nuova istanza della classe Italiano. Nel caso in
input venga data una stringa diversa da queste verrà stampato a video un
messaggio di errore "Error: tipo di ammortamento selezionato errato”.
Le classi Italiano, Francese e Tedesco sono estensioni della classe Ammortamento
e quindi condividono gli stessi campi e gli stessi metodi senza bisogno che
vengano trascritti nuovamente.
Ammortamento alla francese
Questo tipo di ammortamento è caratterizzato da una rata costante, ciascuna rata è
posticipata ed è composta da una quota capitale che per costruzione andrà ad
aumentare nel tempo, e da una quota interessi che vedremo invece ridursi con il
diminuire del debito residuo. Nel metodo main della classe Francese troviamo un
ciclo for che scorre per il trascorrere degli anni (da 1 a 5), nel nostro caso fissati a
5, rispettivamente la rata, la quota capitale e la quota interessi, il debito residuo.
Per calcolare la rata risolviamo con n numero di anni, nel
codice compare una variabile double a per agevolare i calcoli e non appesantire
troppo la sintassi. Per la quota interessi basta applicare il tasso di interesse al
debito residuo e dato che la rata è costante per calcolare la quota capitale basta
sottrarre alla rata la quota interessi.
(debito * i /(1 − i)n)
Ammortamento all’italiana
L’ammortamento all’italiana è caratterizzato da quote capitali costanti nel tempo e
quindi una quota interessi decrescente. Sia la quota capitale che la quota interessi
sono calcolate in via posticipata. La struttura è simile a quella della classe
Francese e quindi troviamo anche qui un ciclo for che scorre gli anni (da 1 a 5) e
calcola la quota capitale, la quota interessi, il debito residuo e la rata.
La quota capitale è calcolata semplicemente come il debito/il numero di rate, che
nel nostro caso equivalgono al numero degli anni avendo rate annuali; la quota
interessi è sempre il tasso di interesse sul debito residuo; chiaramente il debito
residuo è la differenza tra il debito al periodo precedente e la quota capitale e infine
la rata è somma della quota parte di capitale e di interessi.
Ammortamento alla tedesca
Questo tipo di ammortamento è simile al piano di ammortamento francese data la
costanza delle rate ma possiamo notare la differenza nelle quote interessi, infatti
sono calcolate e pagate in via anticipata rispetto al periodo in cui matureranno.
La quota interessi del periodo 0 è calcolata analogamente sul debito, ma in questo
caso la troviamo prima del ciclo for dato il pagamento degli interessi in via
anticipata. A seguire troviamo il ciclo for che scorre da 1 a 5 gli anni e calcola la
quota capitale, il debito residuo, le quote interessi dei periodi successivi a 0 e la
rata come somma delle quote capitali e interessi.
