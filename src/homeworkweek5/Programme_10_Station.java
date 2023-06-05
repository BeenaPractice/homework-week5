package homeworkweek5;

import java.util.HashMap;
import java.util.Scanner;

/*
Write a programme that tells you which line passes through particular stations.
Just use Zone 1 stations name.
 /*
 Write a programme that tells you which line passes through particular stations.
Just use Zone 1 stations name
 */

public class Programme_10_Station {
    public static void main(String[] args) {
        HashMap<String,String> stations = new HashMap<String,String>();
        stations.put("Aldgate", "Metropolitan,Circle");
        stations.put("Aldgate East", "District Line, Hammersmith & City Line");
        stations.put("Angel","Northern Line");

        stations.put("Baker Street","Bakerloo Line, Jubilee Line, Metropolitan Line, Circle Line, Hammersmith & City Line");

        stations.put("Bank","Central Line, Northern Line, Waterloo & City Line, DLR");
        stations.put("Barbican","Circle Line, Hammersmith & City Line, Metropolitan Line");
        stations.put("Blackfriars","Circle Line, District Line, Southeastern, Thameslink");
        stations.put("Bond Street","Central Line, Jubilee Line");
        stations.put("Borough","Northern Line");
        stations.put("Cannon Street","Circle Line, District Line, Southeastern");
        stations.put("Chancery Lane", "Central Line");
        stations.put("Charing Cross","Bakerloo Line, Northern Line");
        stations.put("Covent Garden","Piccadilly Line");
        stations.put("Earl's Court","District Line, Piccadilly Line");
        stations.put("Edgware Road","Bakerloo Line, District Line, Circle Line, Hammersmith & City Line");

        stations.put("Embankment","Bakerloo Line, District Line, Circle Line, Northern Line");
        stations.put("Euston","Northern Line, Victoria Line");
        stations.put("Euston Square","Circle Line, Hammersmith & City Line, Metropolitan Line");
        stations.put("Farringdon","Circle Line, Hammersmith & City Line, Metropolitan Line");
        stations.put("Goodge Street","Northern Line");
        stations.put("Great Portland Street","Circle Line, Hammersmith & City Line, Metropolitan Line");
        stations.put("Green Park", "Piccadilly Line, Victoria Line, Jubilee Line");
        stations.put("Holborn", "Central Line, Piccadilly Line");
        stations.put("Hyde Park Corner","Piccadilly Line");
        stations.put("King's Cross St. Pancras","Circle Line, Hammersmith & City Line, Metropolitan Line, Northern Line, Piccadilly Line, Victoria Line");
        stations.put("Knightsbridge","Piccadilly Line");
        stations.put("Lambeth North","Bakerloo Line");
        stations.put("Leicester Square","Northern Line, Piccadilly Line");
        stations.put("Liverpool Street","Central Line, Circle Line, Hammersmith & City Line, Metropolitan Line");
        stations.put("London Bridge","Northern Line, Jubilee Line");
        stations.put("Mansion House","Circle Line, District Line");
        stations.put("Marble Arch","Central Line");
        stations.put("Marylebone","Bakerloo Line");
        stations.put("Monument","Circle Line, District Line");
        stations.put("Moorgate","Circle Line, Hammersmith & City Line, Metropolitan Line, Northern Line");
        stations.put("Old Street","Northern Line");
        stations.put("Oxford Circus","Bakerloo Line, Central Line, Victoria Line");
        stations.put("Paddington","Bakerloo Line, Circle Line, District Line, Hammersmith & City Line");
        stations.put("Piccadilly Circus","Bakerloo Line, Piccadilly Line");
        stations.put("Pimlico","Victoria Line");
        stations.put("Queen's Park","Bakerloo Line");
        stations.put("Regent's Park","Bakerloo Line");
        stations.put("Russell Square","Piccadilly Line");
        stations.put("St. James's Park","Circle Line, District Line");
        stations.put("St. Pancras International","Circle Line, Hammersmith & City Line, Metropolitan Line, Northern Line, Piccadilly Line");
        stations.put("Temple","Circle Line, District Line");
        stations.put("Tottenham Court Road","Central Line, Northern Line");
        stations.put("Tower Hill","Circle Line, District Line");
        stations.put("Vauxhall","Victoria Line");
        stations.put("Victoria","Circle Line, District Line, Victoria Line");
        stations.put("Warren Street","Northern Line, Victoria Line");
        stations.put("Waterloo","Bakerloo Line, Jubilee Line, Northern Line, Waterloo");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Station Name: ");
        String st1 = scanner.nextLine();
        System.out.println(stations.get(st1));

    }


}
