package typinghomework;

import java.util.Scanner;

/*
Write the programme that tell you which line pass through particular stations. Just use Zone 1 stations name
 */
public class Programme_10TubeLine {

    public static void main(String[] args) {

        // List of all station in Zone 1 of London
        String[] tubeStationZone1 = new String[]{
                "Aldgate","Aldgate East","Angel","Baker Street","Bank","Barbican","Bayswater","Blackfriars","Bond Street","Borough","Cannon Street","Chancery Lane", "Charing Cross", "Covent Garden", "Earl's Court",
                "Edgware Road", "Elephant & Castle", "Embankment", "Euston", "Euston Square", "Farringdon", "Gloucester Road",
                "Goodge Street", "Great Portland Street", "Green Park", "High Street Kensington", "Holborn", "Hyde Park Corner", "King's Cross","Knightsbridge","Lambeth North", "Lancaster Gate","Leicester Square",
                "Liverpool Street", "London Bridge","Mansion House","Marble Arch","Marylebone","Monument","Moorgate","Nottinghill Gate","Old Street", "Oxford Circus", "Paddington",
                "Piccadilly Circus","Pimlico","Queensway","Regent's Park","Russell Square", "Sloane Square",
                "South Kensington", "St Pancras", "St. Paul's", "Temple", "Tottenham Court Road", "Tower Gateway",
                "Tower Hill", "Vauxhall", "Victoria", "Warren Street", "Waterloo East", "Waterloo", "Westminster"};

        System.out.println(tubeStationZone1.length);// for debug purpose
        int length = tubeStationZone1.length;

        String[][] londonUGlines = new String[12][length];
        londonUGlines[0][0] = "Bakaerloo line"; // line name
        londonUGlines[0][1]= "Baker Street"; // Station name
        londonUGlines[0][2] = "Charing Cross";
        londonUGlines[0][3] = "Edgware Road";
        londonUGlines[0][4] = "Elephant & Castle";
        londonUGlines[0][5] = "Embankment";
        londonUGlines[0][6] = "Lambeth North";
        londonUGlines[0][7] = "Marylebone";
        londonUGlines[0][8] = "Oxford Circus";
        londonUGlines[0][9] = "Regent's Park";
        londonUGlines[0][10] = "Waterloo";

        londonUGlines[1][0]= "Central line";
        londonUGlines[1][1]= "Aldgate";
        londonUGlines[1][2]= "Baker Street";
        londonUGlines[1][3] = "Barbican";
        londonUGlines[1][4] = "Bayswater";
        londonUGlines[1][5] = "Bank";
        londonUGlines[1][6] = "Bond Street";
        londonUGlines[1][7] = "Chancery Lane";
        londonUGlines[1][8] = "Holborn";
        londonUGlines[1][9] = "Lancaster Gate";
        londonUGlines[1][11] = "Marble Arch";
        londonUGlines[1][12] = "Notting Hill Gate";
        londonUGlines[1][13] = "Oxford Circus";
        londonUGlines[1][14] = "Queensway";
        londonUGlines[1][15] = "St. Paul's";
        londonUGlines[1][16] = "Tottenham Court Road";


        londonUGlines[2][0] = "Circle Line";
        londonUGlines[2][1] = "Edgware Road";
        londonUGlines[2][2] = "Baker Street";
        londonUGlines[2][3] = "Farringdon";
        londonUGlines[2][4] = "Barbican";
        londonUGlines[2][5] = "Aldgate";
        londonUGlines[2][6] = "Blackfriars";
        londonUGlines[2][7] = "Bayswater";
        londonUGlines[2][8] = "Cannon Street";
        londonUGlines[2][9] = "Embankment";
        londonUGlines[2][10] = "Euston Square";
        londonUGlines[2][11] = "Gloucester Road";
        londonUGlines[2][12] = "Great Portland Street";
        londonUGlines[2][13] = "High Street Kensington";
        londonUGlines[2][14] = "King's Cross";
        londonUGlines[2][15] = "Liverpool Street";
        londonUGlines[2][16] = "Mansion House";
        londonUGlines[2][17] = "Monument";
        londonUGlines[2][18] = "Notting Hill Gate";
        londonUGlines[2][19] = "Sloane Square";
        londonUGlines[2][20] = "South Kensington";
        londonUGlines[2][21] = "St Pancras";
        londonUGlines[2][22] = "Temple";
        londonUGlines[2][23] = "Tower Hill";
        londonUGlines[2][24] = "Victoria";
        londonUGlines[2][25] = "Westminster";

        londonUGlines[3][0] = "District Line";
        londonUGlines[3][1] = "Edgware Road";
        londonUGlines[3][2] = "Paddington";
        londonUGlines[3][3] = "Bayswater";
        londonUGlines[3][4] = "Aldgate East";
        londonUGlines[3][5] = "Blackfriars";
        londonUGlines[3][6] = "Cannon Street";
        londonUGlines[3][7] = "Earl's Court";
        londonUGlines[3][8] = "Embankment";
        londonUGlines[3][9] = "Gloucester Road";
        londonUGlines[3][10] = "High Street Kensington";
        londonUGlines[3][11] = "Mansion House";
        londonUGlines[3][12] = "Monument";
        londonUGlines[3][13] = "Notting Hill Gate";
        londonUGlines[3][14] = "Sloane Square";
        londonUGlines[3][15] = "South Kensington";
        londonUGlines[3][16] = "Temple";
        londonUGlines[3][17] = "Tower Hill";
        londonUGlines[3][18] = "Victoria";
        londonUGlines[3][19] = "Westminster";

        londonUGlines[4][0] = "Hammersmith Line";
        londonUGlines[4][1] = "Aldgate East";
        londonUGlines[4][2] = "Liverpool Street";
        londonUGlines[4][3] = "King's Cross";
        londonUGlines[4][4] = "Barbican";
        londonUGlines[4][5] = "Edgware Road";
        londonUGlines[4][6] = "Euston Square";
        londonUGlines[4][7] = "Farringdon";
        londonUGlines[4][8] = "Great Portland Street";
        londonUGlines[4][9] = "St Pancras";

        londonUGlines[5][0] = "Jubilee Line";
        londonUGlines[5][1] = "Baker Street";
        londonUGlines[5][2] = "Bond Street";
        londonUGlines[5][3] = "Westminster";
        londonUGlines[5][4] = "Waterloo";
        londonUGlines[5][5] = "Green Park";
        londonUGlines[5][6] = "London Bridge";

        londonUGlines[6][0] = "Metropolitan Line";
        londonUGlines[6][1] = "Aldgate";
        londonUGlines[6][2] = "Liverpool Street";
        londonUGlines[6][3] = "Moorgate";
        londonUGlines[6][4] = "Barbican";
        londonUGlines[6][5] = "Baker Street";
        londonUGlines[6][6] = "Euston Square";
        londonUGlines[6][7] = "Farringdon";
        londonUGlines[6][8] = "Great Portland Street";
        londonUGlines[6][9] = "King's Cross";
        londonUGlines[6][10] = "St Pancras";

        londonUGlines[7][0] = "Northern Line";
        londonUGlines[7][1] = "Borough";
        londonUGlines[7][2] = "London Bridge";
        londonUGlines[7][3] = "Moorgate";
        londonUGlines[7][4] = "Old Street";
        londonUGlines[7][5] = "Angel";
        londonUGlines[7][6] = "Bank";
        londonUGlines[7][7] = "Elephant & Castle";
        londonUGlines[7][8] = "Embankment";
        londonUGlines[7][9] = "Euston";
        londonUGlines[7][10] = "Goodge Street";
        londonUGlines[7][11] = "King's Cross";
        londonUGlines[7][12] = "Leicester Square";
        londonUGlines[7][13] = "St Pancras";
        londonUGlines[7][14] = "Warren Street";
        londonUGlines[7][15] = "Waterloo";

        londonUGlines[8][0] = "Piccadilly Line";
        londonUGlines[8][1] = "Green Park";
        londonUGlines[8][2] = "Picaadilly Circus";
        londonUGlines[8][3] = "Leicester Square";
        londonUGlines[8][4] = "Covent Garden";
        londonUGlines[8][5] = "Earl's Court";
        londonUGlines[8][6] = "Gloucester Road";
        londonUGlines[8][7] = "Hyde Park Corner";
        londonUGlines[8][8] = "King's Cross";
        londonUGlines[8][9] = "Knightsbridge";
        londonUGlines[8][10] = "Russell Square";
        londonUGlines[8][11] = "South Kensington";
        londonUGlines[8][12] = "St Pancras";

        londonUGlines[9][0] = "Victoria Line";
        londonUGlines[9][1] = "Euston";
        londonUGlines[9][2] = "Warren Street";
        londonUGlines[9][3] = "Oxford Circus";
        londonUGlines[9][4] = "Green Park";
        londonUGlines[9][5] = "King's Cross";
        londonUGlines[9][6] = "Pimlico";
        londonUGlines[9][7] = "St Pancras";
        londonUGlines[9][8] = "Vauxhall";
        londonUGlines[9][9] = "Victoria";

        londonUGlines[10][0] = "Waterloo & City Line";
        londonUGlines[10][1] = "Bank";
        londonUGlines[10][2] = "Waterloo";
        londonUGlines[10][3] = "Barbican";
        londonUGlines[10][4] = "Bayswater";

        londonUGlines[11][0] = "DLR Line";
        londonUGlines[11][1] = "Bank";
        londonUGlines[11][2] = "Tower Gateway";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the tube station's name of Zone 1 :");
        // Input wizard for the user, and store his/her input as a variable
        String userTubeStation = scan.nextLine();
        String catchStationName = "";

        //Checking, if user input is present in the list of Zone 1 stations
        for (int i = 0; i < tubeStationZone1.length; i++) {
            if (userTubeStation.equalsIgnoreCase(tubeStationZone1[i])) {
                catchStationName = tubeStationZone1[i];
            }
        }

        // Logic to find the Line names from the given input from the user
        if (userTubeStation.equalsIgnoreCase(catchStationName)) {
            System.out.println(userTubeStation + " Station is in the Zone 1.");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Following Line(s) passing through the Given Tube Station : " + userTubeStation);
            System.out.println("--------------------------------------------------------------------------");

            //System.out.println(londonUGLines.length); //for debug purpose
            for (int x = 0; x < londonUGlines.length; x++) {
                for (int y = 1; y < tubeStationZone1.length; y++) {
                    String match = londonUGlines[x][y];
                    //System.out.println("I am here Line : 176" + match); //for debug purpose
                    if (userTubeStation.equalsIgnoreCase(match)) {
                        System.out.println(londonUGlines[x][0]); // first elements of multi dimension array is the line name
                    }
                }
            }
        } else {
            System.out.println("Station is not in the Zone 1.");
        }

    }
}

