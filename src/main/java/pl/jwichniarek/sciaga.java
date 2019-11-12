//package pl.jwichniarek;
//
//public class sciaga {
//    protected void gra()
//    {
//        System.out.println("Witaj w grze Hangman! \n Posiadasz 8 prób, jeżeli 8 razy podasz złą literę lub hasło, przegrywasz! \n Hasło może składać się tylko z 1 słowa \n Podaj hasło: ");
//        Scanner scan = new Scanner(System.in);
//        String sentence = scan.nextLine();
//        sentence = sentence.toLowerCase();//pobrane zdanie
//        int proby = 8; //liczba prob
//        int trueValue = 0;
//        for(int i=0; i<sentence.length() + 8; i++)
//        {
//            System.out.println("Podaj litere lub całe słowo: ");
//            Scanner reply = new Scanner(System.in);    //odpowiedz
//            String letter = reply.nextLine();
//            letter = letter.toLowerCase();//litera
//            int valueSign = letter.length();    //liczba znakow
//            if(letter.equals(sentence))
//            {
//                System.out.println("Odgadłeś hasło gratulacje!");
//                break;
//            }
//            else if(!(letter.equals(sentence)))
//            {
//                for(int k = 0; i<sentence.length(); k++)
//                {
//                    if(sentence.charAt(k) == letter.charAt(0))
//                    {
//                        if(trueValue == valueSign && proby>0)
//                        {
//                            System.out.println("Gratulacje! Wygrałeś");
//                            break;
//                        }
//                        else if(!(trueValue == valueSign) || !(proby<=0))
//                        {
//                            System.out.println("Znak " + sentence.charAt(k) + " znajduje się na pozycji " + k);
//                            trueValue++;
//                            letter = reply.nextLine();
//                        }
//
//                    }
//                    else System.out.println("Zle!!!");
//
//                }
//
//            }
//            else
//            {
//                proby--;
//                System.out.println("Nie trafiłeś! Tracisz życie \n zostało Ci " + proby + " prób");
//                letter = reply.nextLine();
//
//
//            }
//
//
//
//        }
//
//
//    }
//}
