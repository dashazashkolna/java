import java.io.*;
import java.util.*;

public class B05_03 {

    public static double segmentLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double rectanglePerimeter(double x1, double y1, double x2, double y2) {
        double width = Math.abs(x2 - x1);
        double height = Math.abs(y1 - y2);
        return 2 * (width + height);
    }

    public static double circleArea(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        double maxSegment = -1;
        String maxSegmentLine = "";

        double maxRect = -1;
        String maxRectLine = "";

        double minCircle = Double.MAX_VALUE;
        String minCircleLine = "";

        try {
            Scanner sc = new Scanner(new File(inputFile));

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");
                int type = Integer.parseInt(parts[0]);

                if (type == 1 && parts.length >= 5) { //відрізок
                    double x1 = Double.parseDouble(parts[1]);
                    double y1 = Double.parseDouble(parts[2]);
                    double x2 = Double.parseDouble(parts[3]);
                    double y2 = Double.parseDouble(parts[4]);
                    double len = segmentLength(x1, y1, x2, y2);
                    if (len > maxSegment) {
                        maxSegment = len;
                        maxSegmentLine = line;
                    }
                }
                else if (type == 2 && parts.length >= 5) { //прямокутник
                    double x1 = Double.parseDouble(parts[1]);
                    double y1 = Double.parseDouble(parts[2]);
                    double x2 = Double.parseDouble(parts[3]);
                    double y2 = Double.parseDouble(parts[4]);
                    double per = rectanglePerimeter(x1, y1, x2, y2);
                    if (per > maxRect) {
                        maxRect = per;
                        maxRectLine = line;
                    }
                }
                else if (type == 3 && parts.length >= 4) { //коло
                    double r = Double.parseDouble(parts[3]);
                    double area = circleArea(r);
                    if (area < minCircle) {
                        minCircle = area;
                        minCircleLine = line;
                    }
                }
            }
            sc.close();

            PrintWriter pw = new PrintWriter(new FileWriter(outputFile));
            pw.println("a) Відрізок з найбільшою довжиною:");
            pw.println(maxSegmentLine);
            pw.println(maxSegment);

            pw.println("\nb) Прямокутник з найбільшим периметром:");
            pw.println(maxRectLine);
            pw.println(maxRect);

            pw.println("\nc) Коло з найменшою площею:");
            pw.println(minCircleLine);
            pw.println(minCircle);

            pw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
