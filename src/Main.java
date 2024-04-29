//Sukurkite abstraktų klasės TransportoPriemone modelį, turintį bendrus atributus ir
// abstrakčius metodus vaziuoti() ir stabdyti().
// Sukurkite išvestines klases Automobilis ir Dviratis, kurios implementuoja šiuos metodus.


        public class Main {
            public static void main(String[] args) {
                TransportoPriemone obj = new Automobilis("Volvo", "xc70", 1995);
                TransportoPriemone ob1 = new Dviratis( "Miesto", "Streetas ", 2000);
                obj.spausdinkInfo();
                obj.vaziuoti();
                obj.stabdyti();

                ob1.spausdinkInfo();
                ob1.vaziuoti();
                ob1.stabdyti();
            }
        }
