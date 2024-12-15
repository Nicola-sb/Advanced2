package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String,Integer>> userLogsMap=new TreeMap<>();

        String command=scanner.nextLine();
        while (!command.equals("end")){
            String ip=command.split("\\s+")[0].split("=")[1];//->>split ["IP=192.23.30.40","message='Hello&derps","user=destroyer"].split-->["IP=192.23.30.40"]
            String message=command.split("\\s+")[1].split("=")[1];
            String user=command.split("\\s+")[2].split("=")[1];
            //IP=192.23.30.40 message='Hello&derps.' user=destroyer

            if(!userLogsMap.containsKey(user)){
                userLogsMap.put(user,new LinkedHashMap<>());
                Map<String,Integer>newMap=new LinkedHashMap<>();
                newMap.put(ip,1);
            }else{
                Map<String,Integer>currentIps=userLogsMap.get(user);//списък с IP
                //Имаме 2 варианта   :
                //IP-to да е посетено и да не е посетено

                //ако ip-to ми е посещавано
                if(currentIps.containsKey(ip)){
                    //Трябва да взема до момента колко пъти е посетено
                    int currentTimes=currentIps.get(ip);
                    currentIps.put(ip,currentTimes+1);
                }else{
                    currentIps.put(ip,1);
                }
            }
            command=scanner.nextLine();
        }

        userLogsMap.keySet().forEach(username->{
            System.out.println(username +":");
            //Трябва да си отпечатам на usernama ip-tata
            Map<String,Integer>ips=userLogsMap.get(username);//Взимам Ip-tata na текущия username
            //За всяко едно Ip трябва да вземем неговия запис-->entrySet
            //{IP} => {count}, {IP} => {count}."
            ips.entrySet().forEach(entry->{
                System.out.print(entry.getKey()+" => "+entry.getValue()+".");
                System.out.println();
            });

        });

    }
}
